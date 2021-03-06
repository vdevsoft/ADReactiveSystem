package com.eevolution.context.dictionary.infrastructure.repository

import com.eevolution.context.dictionary.domain.model.PinStancePara
import com.eevolution.context.dictionary.infrastructure.db.DbContext._

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
  * Created by emeris.hernandez@e-evolution.com , www.e-evolution.com on 26/10/17.
  */

/**
  * Pin Stance Para Mapping
  */

trait PinStanceParaMapping {
  val queryPinStancePara = quote {
    querySchema[PinStancePara]("AD_PinStance_Para",
      _.pinStanceId-> "AD_PinStance_ID",
      _.tenantId-> "AD_Client_ID",
      _.organizationId-> "AD_Org_ID",
      _.seqNo-> "SeqNo",
      _.parameterName-> "ParameterName",
      _.string-> "P_String",
      _.stringTo-> "P_String_To",
      _.number-> "P_Number",
      _.numberTo-> "P_Number_To",
      _.date-> "P_Date",
      _.dateTo-> "P_Date_To",
      _.info-> "Info",
      _.infoTo-> "Info_To",
      _.created-> "Created",
      _.createdBy-> "CreatedBy",
      _.updated-> "Updated",
      _.updatedBy-> "UpdatedBy",
      _.isActive-> "IsActive",
      _.uuid-> "UUID")
  }
}
