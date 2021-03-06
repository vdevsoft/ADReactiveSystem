package com.eevolution.context.dictionary.infrastructure.repository

import java.util.UUID

import com.eevolution.context.dictionary.domain._
import com.eevolution.context.dictionary.domain.model.Archive
import com.eevolution.context.dictionary.infrastructure.db.DbContext._
import com.eevolution.utils.PaginatedSequence
import com.lightbend.lagom.scaladsl.persistence.jdbc.JdbcSession

import scala.concurrent.{ExecutionContext, Future}

/**
  * Copyright (C) 2003-2017, e-Evolution Consultants S.A. , http://www.e-evolution.com
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  * Email: emeris.hernandez@e-evolution.com, http://www.e-evolution.com , http://github.com/EmerisScala
  * Created by emeris.hernandez@e-evolution.com , www.e-evolution.com on 07/11/17.
  */

/**
  * Archive Repository
  * @param session
  * @param executionContext
  */

class ArchiveRepository(session: JdbcSession)(implicit executionContext: ExecutionContext)
  extends api.repository.ArchiveRepository[Archive , Int]
    with ArchiveMapping {

  def getById(id: Int): Future[Archive] = {
    Future(run(queryArchive.filter(_.archiveId == lift(id))).headOption.get)
  }

  def getByUUID(uuid: UUID): Future[Archive] = {
    Future(run(queryArchive.filter(_.uuid == lift(uuid.toString))).headOption.get)
  }

  def getByArchiveId(id : Int) : Future[List[Archive]] = {
    Future(run(queryArchive))
  }

  def getAll() : Future[List[Archive]] = {
    Future(run(queryArchive))
  }

  def getAllByPage(page: Int, pageSize: Int): Future[PaginatedSequence[Archive]] = {
    val offset = page * pageSize
    val limit = (page + 1) * pageSize
    for {
      count <- countArchive()
      elements <- if (offset > count) Future.successful(Nil)
      else selectArchive(offset, limit)
    } yield {
      PaginatedSequence(elements, page, pageSize, count)
    }
  }

  private def countArchive() = {
    Future(run(queryArchive.size).toInt)
  }

  private def selectArchive(offset: Int, limit: Int): Future[Seq[Archive]] = {
    Future(run(queryArchive).drop(offset).take(limit).toSeq)
  }
}
