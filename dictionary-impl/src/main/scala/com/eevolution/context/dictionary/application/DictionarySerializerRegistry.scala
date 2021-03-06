package com.eevolution.context.dictionary.application

import com.eevolution.context.dictionary.domain.model._
import com.lightbend.lagom.scaladsl.playjson.{JsonSerializer, JsonSerializerRegistry}

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
  * Email: victor.perez@e-evolution.com, http://www.e-evolution.com , http://github.com/e-Evolution
  * Created by victor.perez@e-evolution.com , www.e-evolution.com
  */

/**
  * Dictionary Serializer Registry
  */
object DictionarySerializerRegistry extends JsonSerializerRegistry {
  override def serializers = List(

    JsonSerializer[AccessLog],
    JsonSerializer[Alert],
    JsonSerializer[AlertProcessor],
    JsonSerializer[AlertProcessorLog],
    JsonSerializer[AlertRecipient],
    JsonSerializer[AlertRule],
    JsonSerializer[Archive],
    JsonSerializer[Attachment],
    JsonSerializer[AttachmentNote],
    JsonSerializer[Attribute],
    JsonSerializer[AttributeAccess],
    JsonSerializer[AttributeExtend],
    JsonSerializer[AttributeProcess],
    JsonSerializer[AttributeProcessPara],
    JsonSerializer[AttributeTrl],
    JsonSerializer[AttributeValueExtend],
    JsonSerializer[Browse],
    JsonSerializer[BrowseAccess],
    JsonSerializer[BrowseField],
    JsonSerializer[BrowseFieldTrl],
    JsonSerializer[BrowseTrl],
    JsonSerializer[ChangeLog],
    JsonSerializer[Chart],
    JsonSerializer[ChartDataSource],
    JsonSerializer[Color],
    JsonSerializer[Desktop],
    JsonSerializer[DesktopTrl],
    JsonSerializer[DesktopWorkbench],
    JsonSerializer[DocumentActionAccess],
    JsonSerializer[DynamicValidationRule],
    JsonSerializer[Element],
    JsonSerializer[ElementTrl],
    JsonSerializer[EmailConfig],
    JsonSerializer[Entity],
    JsonSerializer[EntityType],
    JsonSerializer[Error],
    JsonSerializer[Field],
    JsonSerializer[FieldGroup],
    JsonSerializer[FieldGroupTrl],
    JsonSerializer[FieldTrl],
    JsonSerializer[Find],
    JsonSerializer[Form],
    JsonSerializer[FormAccess],
    JsonSerializer[FormTrl],
    JsonSerializer[HouseKeeping],
    JsonSerializer[Image],
    JsonSerializer[ImportFormat],
    JsonSerializer[ImportFormatRow],
    JsonSerializer[InfoColumnTrl],
    JsonSerializer[InformationColumn],
    JsonSerializer[InformationWindow],
    JsonSerializer[InformationWindowTrl],
    JsonSerializer[Issue],
    JsonSerializer[LabelPrinter],
    JsonSerializer[LabelPrinterFunction],
    JsonSerializer[Language],
    JsonSerializer[LdapAccess],
    JsonSerializer[LdapProcessor],
    JsonSerializer[LdapProcessorLog],
    JsonSerializer[Memo],
    JsonSerializer[Menu],
    JsonSerializer[MenuTrl],
    JsonSerializer[Message],
    JsonSerializer[MessageTrl],
    JsonSerializer[Migration],
    JsonSerializer[MigrationData],
    JsonSerializer[MigrationScript],
    JsonSerializer[MigrationStep],
    JsonSerializer[ModelValidator],
    JsonSerializer[Modification],
    JsonSerializer[Note],
    JsonSerializer[Organization],
    JsonSerializer[OrganizationInfo],
    JsonSerializer[OrganizationType],
    JsonSerializer[PackageExport],
    JsonSerializer[PackageExportCommon],
    JsonSerializer[PackageExportDetail],
    JsonSerializer[PackageImport],
    JsonSerializer[PackageImportBackup],
    JsonSerializer[PackageImportDetail],
    JsonSerializer[PackageImportInstall],
    JsonSerializer[PackageImportProcess],
    JsonSerializer[PinStance],
    JsonSerializer[PinStanceLog],
    JsonSerializer[PinStancePara],
    JsonSerializer[Preference],
    JsonSerializer[PrintColor],
    JsonSerializer[PrintFont],
    JsonSerializer[PrintForm],
    JsonSerializer[PrintFormat],
    JsonSerializer[PrintFormatItem],
    JsonSerializer[PrintFormatItemTrl],
    JsonSerializer[PrintGraph],
    JsonSerializer[PrintLabel],
    JsonSerializer[PrintLabelLine],
    JsonSerializer[PrintLabelLineTrl],
    JsonSerializer[PrintPaper],
    JsonSerializer[PrintTableFormat],
    JsonSerializer[PrivateAccess],
    JsonSerializer[Process],
    JsonSerializer[ProcessAccess],
    JsonSerializer[ProcessParameter],
    JsonSerializer[ProcessParameterTrl],
    JsonSerializer[ProcessTrl],
    JsonSerializer[RecentItem],
    JsonSerializer[RecordAccess],
    JsonSerializer[Reference],
    JsonSerializer[ReferenceEntity],
    JsonSerializer[ReferenceList],
    JsonSerializer[ReferenceListTrl],
    JsonSerializer[ReferenceTrl],
    JsonSerializer[Registration],
    JsonSerializer[RelationType],
    JsonSerializer[Replication],
    JsonSerializer[ReplicationDocument],
    JsonSerializer[ReplicationLog],
    JsonSerializer[ReplicationOrganizationAccess],
    JsonSerializer[ReplicationRoleAccess],
    JsonSerializer[ReplicationRun],
    JsonSerializer[ReplicationStrategy],
    JsonSerializer[ReplicationTable],
    JsonSerializer[ReportView],
    JsonSerializer[ReportViewAttribute],
    JsonSerializer[ReportViewTrl],
    JsonSerializer[Role],
    JsonSerializer[RoleIncluded],
    JsonSerializer[RoleOrganizationAccess],
    JsonSerializer[Rule],
    JsonSerializer[Scheduler],
    JsonSerializer[SchedulerLog],
    JsonSerializer[SchedulerParameter],
    JsonSerializer[SchedulerRecipient],
    JsonSerializer[SearchDefinition],
    JsonSerializer[Sequence],
    JsonSerializer[SequenceAudit],
    JsonSerializer[SequenceNo],
    JsonSerializer[Session],
    JsonSerializer[SysConfig],
    JsonSerializer[System],
    JsonSerializer[Tab],
    JsonSerializer[TabTrl],
    JsonSerializer[Task],
    JsonSerializer[TaskAccess],
    JsonSerializer[TaskInstance],
    JsonSerializer[TaskTrl],
    JsonSerializer[Tenant],
    JsonSerializer[TenantInfo],
    JsonSerializer[TenantShare],
    JsonSerializer[Tree],
    JsonSerializer[TreeBar],
    JsonSerializer[TreeFavorite],
    JsonSerializer[TreeFavoriteNode],
    JsonSerializer[TreeNode],
    JsonSerializer[TreeNodeBP],
    JsonSerializer[TreeNodeCMC],
    JsonSerializer[TreeNodeCMM],
    JsonSerializer[TreeNodeCMS],
    JsonSerializer[TreeNodeCMT],
    JsonSerializer[TreeNodeMM],
    JsonSerializer[TreeNodePR],
    JsonSerializer[TreeNodeU1],
    JsonSerializer[TreeNodeU2],
    JsonSerializer[TreeNodeU3],
    JsonSerializer[TreeNodeU4],
    JsonSerializer[User],
    JsonSerializer[UserBusinessPartnerAccess],
    JsonSerializer[UserDefinedField],
    JsonSerializer[UserDefinedTab],
    JsonSerializer[UserDefinedWindow],
    JsonSerializer[UserMail],
    JsonSerializer[UserOrganizationAccess],
    JsonSerializer[UserQuery],
    JsonSerializer[UserRoles],
    JsonSerializer[UserSubstitute],
    JsonSerializer[View],
    JsonSerializer[ViewAttribute],
    JsonSerializer[ViewAttributeTrl],
    JsonSerializer[ViewDefinition],
    JsonSerializer[ViewTrl],
    JsonSerializer[Window],
    JsonSerializer[WindowAccess],
    JsonSerializer[WindowTrl],
    JsonSerializer[Workbench],
    JsonSerializer[WorkbenchTrl],
    JsonSerializer[WorkbenchWindow],
    JsonSerializer[Workflow],
    JsonSerializer[WorkflowAccess],
    JsonSerializer[WorkflowActivity],
    JsonSerializer[WorkflowActivityResult],
    JsonSerializer[WorkflowBlock],
    JsonSerializer[WorkflowEventAudit],
    JsonSerializer[WorkflowNextCondition],
    JsonSerializer[WorkflowNode],
    JsonSerializer[WorkflowNodeNext],
    JsonSerializer[WorkflowNodePara],
    JsonSerializer[WorkflowNodeTrl],
    JsonSerializer[WorkflowProcess],
    JsonSerializer[WorkflowProcessData],
    JsonSerializer[WorkflowProcessor],
    JsonSerializer[WorkflowProcessorLog],
    JsonSerializer[WorkflowResponsible],
    JsonSerializer[WorkflowTrl],
    JsonSerializer[ZoomCondition]

  )
}
