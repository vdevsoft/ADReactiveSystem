package com.eevolution.context.dictionary.domain.model

import ai.x.play.json.Jsonx
import com.eevolution.context.dictionary.api.{ActiveEnabled, DomainModel, Identifiable, Traceable}
import org.joda.time.DateTime
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
  * Email: eduardo.moreno@e-evolution.com, http://www.e-evolution.com , http://github.com/e-Evolution
  * Created by eduardo.moreno@e-evolution.com , www.e-evolution.com
  */
/**
  * Replication Table Entity
  * @param replicationTableId Replication Table ID
  * @param tenantId Tenant ID
  * @param organizationId Organization ID
  * @param isActive Is Active
  * @param created Created
  * @param createdBy Created By
  * @param updated Updated
  * @param updatedBy Updated By
  * @param replicationStrategyId Replication Strategy ID
  * @param entityId Entity ID
  * @param replicationType Replication Type
  * @param entityType Entity Type
  * @param description Description
  * @param uuid UUID
  */

case class ReplicationTable (replicationTableId: Int,
                             tenantId: Int,
                             organizationId: Int,
                             isActive : Boolean = true,
                             created : DateTime = DateTime.now,
                             createdBy : Int ,
                             updated : DateTime = DateTime.now,
                             updatedBy : Int,
                             replicationStrategyId: Int,
                             entityId: Int,
                             replicationType: String = "L",
                             entityType: String = "D",
                             description: Option[String],
                             uuid: String
                            ) extends DomainModel

  with ActiveEnabled
  with Identifiable
  with Traceable {
  override type ActiveEnabled = this.type
  override type Identifiable = this.type
  override type Traceable = this.type

  override def Id: Int = replicationTableId

  override val entityName: String = "AD_ReplicationTable"
  override val identifier: String = "AD_ReplicationTable_ID"
}

object ReplicationTable  {
  implicit lazy val jsonFormat = Jsonx.formatCaseClass[ReplicationTable]
  def create(replicationTableId: Int,
             tenantId: Int,
             organizationId: Int,
             isActive : Boolean,
             created : DateTime,
             createdBy : Int ,
             updated : DateTime,
             updatedBy : Int,
             replicationStrategyId: Int,
             entityId: Int,
             replicationType: String,
             entityType: String,
             description: String,
             uuid: String) = ReplicationTable(replicationTableId, tenantId, organizationId, isActive, created,
    createdBy, updated, updatedBy, replicationStrategyId, entityId, replicationType, entityType, None, uuid)
}