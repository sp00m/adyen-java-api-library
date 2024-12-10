/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.CapabilityProblem;
import com.adyen.model.legalentitymanagement.DocumentReference;
import com.adyen.model.legalentitymanagement.EntityReference;
import com.adyen.model.legalentitymanagement.Individual;
import com.adyen.model.legalentitymanagement.LegalEntityAssociation;
import com.adyen.model.legalentitymanagement.LegalEntityCapability;
import com.adyen.model.legalentitymanagement.Organization;
import com.adyen.model.legalentitymanagement.SoleProprietorship;
import com.adyen.model.legalentitymanagement.TransferInstrumentReference;
import com.adyen.model.legalentitymanagement.Trust;
import com.adyen.model.legalentitymanagement.UnincorporatedPartnership;
import com.adyen.model.legalentitymanagement.VerificationDeadline;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * LegalEntity
 */
@JsonPropertyOrder({
  LegalEntity.JSON_PROPERTY_CAPABILITIES,
  LegalEntity.JSON_PROPERTY_DOCUMENT_DETAILS,
  LegalEntity.JSON_PROPERTY_DOCUMENTS,
  LegalEntity.JSON_PROPERTY_ENTITY_ASSOCIATIONS,
  LegalEntity.JSON_PROPERTY_ID,
  LegalEntity.JSON_PROPERTY_INDIVIDUAL,
  LegalEntity.JSON_PROPERTY_ORGANIZATION,
  LegalEntity.JSON_PROPERTY_PROBLEMS,
  LegalEntity.JSON_PROPERTY_REFERENCE,
  LegalEntity.JSON_PROPERTY_SOLE_PROPRIETORSHIP,
  LegalEntity.JSON_PROPERTY_TRANSFER_INSTRUMENTS,
  LegalEntity.JSON_PROPERTY_TRUST,
  LegalEntity.JSON_PROPERTY_TYPE,
  LegalEntity.JSON_PROPERTY_UNINCORPORATED_PARTNERSHIP,
  LegalEntity.JSON_PROPERTY_VERIFICATION_DEADLINES,
  LegalEntity.JSON_PROPERTY_VERIFICATION_PLAN
})

public class LegalEntity {
  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private Map<String, LegalEntityCapability> capabilities = null;

  public static final String JSON_PROPERTY_DOCUMENT_DETAILS = "documentDetails";
  private List<DocumentReference> documentDetails = null;

  public static final String JSON_PROPERTY_DOCUMENTS = "documents";
  @Deprecated // deprecated since Legal Entity Management API v1: Use the `documentDetails` array instead.
  private List<EntityReference> documents = null;

  public static final String JSON_PROPERTY_ENTITY_ASSOCIATIONS = "entityAssociations";
  private List<LegalEntityAssociation> entityAssociations = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDIVIDUAL = "individual";
  private Individual individual;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private Organization organization;

  public static final String JSON_PROPERTY_PROBLEMS = "problems";
  private List<CapabilityProblem> problems = null;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SOLE_PROPRIETORSHIP = "soleProprietorship";
  private SoleProprietorship soleProprietorship;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENTS = "transferInstruments";
  private List<TransferInstrumentReference> transferInstruments = null;

  public static final String JSON_PROPERTY_TRUST = "trust";
  private Trust trust;

  /**
   * The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**.
   */
  public enum TypeEnum {
    INDIVIDUAL("individual"),
    
    ORGANIZATION("organization"),
    
    SOLEPROPRIETORSHIP("soleProprietorship"),
    
    TRUST("trust"),
    
    UNINCORPORATEDPARTNERSHIP("unincorporatedPartnership");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_UNINCORPORATED_PARTNERSHIP = "unincorporatedPartnership";
  private UnincorporatedPartnership unincorporatedPartnership;

  public static final String JSON_PROPERTY_VERIFICATION_DEADLINES = "verificationDeadlines";
  private List<VerificationDeadline> verificationDeadlines = null;

  public static final String JSON_PROPERTY_VERIFICATION_PLAN = "verificationPlan";
  private String verificationPlan;

  public LegalEntity() { 
  }

  /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   *
   * @param capabilities
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity capabilities(Map<String, LegalEntityCapability> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public LegalEntity putCapabilitiesItem(String key, LegalEntityCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

  /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   * @return capabilities
   */
  @ApiModelProperty(value = "Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, LegalEntityCapability> getCapabilities() {
    return capabilities;
  }

  /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   *
   * @param capabilities
   */ 
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(Map<String, LegalEntityCapability> capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * List of documents uploaded for the legal entity.
   *
   * @param documentDetails
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity documentDetails(List<DocumentReference> documentDetails) {
    this.documentDetails = documentDetails;
    return this;
  }

  public LegalEntity addDocumentDetailsItem(DocumentReference documentDetailsItem) {
    if (this.documentDetails == null) {
      this.documentDetails = new ArrayList<>();
    }
    this.documentDetails.add(documentDetailsItem);
    return this;
  }

  /**
   * List of documents uploaded for the legal entity.
   * @return documentDetails
   */
  @ApiModelProperty(value = "List of documents uploaded for the legal entity.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DocumentReference> getDocumentDetails() {
    return documentDetails;
  }

  /**
   * List of documents uploaded for the legal entity.
   *
   * @param documentDetails
   */ 
  @JsonProperty(JSON_PROPERTY_DOCUMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentDetails(List<DocumentReference> documentDetails) {
    this.documentDetails = documentDetails;
  }

  /**
   * List of documents uploaded for the legal entity.
   *
   * @param documents
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   *
   * @deprecated since Legal Entity Management API v1
   * Use the &#x60;documentDetails&#x60; array instead.
   */
  @Deprecated
  public LegalEntity documents(List<EntityReference> documents) {
    this.documents = documents;
    return this;
  }

  public LegalEntity addDocumentsItem(EntityReference documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * List of documents uploaded for the legal entity.
   * @return documents
   *
   * @deprecated since Legal Entity Management API v1
   * Use the &#x60;documentDetails&#x60; array instead.
   */
  @Deprecated
  @ApiModelProperty(value = "List of documents uploaded for the legal entity.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityReference> getDocuments() {
    return documents;
  }

  /**
   * List of documents uploaded for the legal entity.
   *
   * @param documents
   *
   * @deprecated since Legal Entity Management API v1
   * Use the &#x60;documentDetails&#x60; array instead.
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocuments(List<EntityReference> documents) {
    this.documents = documents;
  }

  /**
   * List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.
   *
   * @param entityAssociations
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity entityAssociations(List<LegalEntityAssociation> entityAssociations) {
    this.entityAssociations = entityAssociations;
    return this;
  }

  public LegalEntity addEntityAssociationsItem(LegalEntityAssociation entityAssociationsItem) {
    if (this.entityAssociations == null) {
      this.entityAssociations = new ArrayList<>();
    }
    this.entityAssociations.add(entityAssociationsItem);
    return this;
  }

  /**
   * List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.
   * @return entityAssociations
   */
  @ApiModelProperty(value = "List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LegalEntityAssociation> getEntityAssociations() {
    return entityAssociations;
  }

  /**
   * List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.
   *
   * @param entityAssociations
   */ 
  @JsonProperty(JSON_PROPERTY_ENTITY_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityAssociations(List<LegalEntityAssociation> entityAssociations) {
    this.entityAssociations = entityAssociations;
  }

  /**
   * The unique identifier of the legal entity.
   *
   * @param id
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the legal entity.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the legal entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the legal entity.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * individual
   *
   * @param individual
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity individual(Individual individual) {
    this.individual = individual;
    return this;
  }

  /**
   * individual
   * @return individual
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDIVIDUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Individual getIndividual() {
    return individual;
  }

  /**
   * individual
   *
   * @param individual
   */ 
  @JsonProperty(JSON_PROPERTY_INDIVIDUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndividual(Individual individual) {
    this.individual = individual;
  }

  /**
   * organization
   *
   * @param organization
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity organization(Organization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * organization
   * @return organization
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Organization getOrganization() {
    return organization;
  }

  /**
   * organization
   *
   * @param organization
   */ 
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  /**
   * List of verification errors related to capabilities for the legal entity.
   *
   * @param problems
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity problems(List<CapabilityProblem> problems) {
    this.problems = problems;
    return this;
  }

  public LegalEntity addProblemsItem(CapabilityProblem problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

  /**
   * List of verification errors related to capabilities for the legal entity.
   * @return problems
   */
  @ApiModelProperty(value = "List of verification errors related to capabilities for the legal entity.")
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CapabilityProblem> getProblems() {
    return problems;
  }

  /**
   * List of verification errors related to capabilities for the legal entity.
   *
   * @param problems
   */ 
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProblems(List<CapabilityProblem> problems) {
    this.problems = problems;
  }

  /**
   * Your reference for the legal entity, maximum 150 characters.
   *
   * @param reference
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the legal entity, maximum 150 characters.
   * @return reference
   */
  @ApiModelProperty(value = "Your reference for the legal entity, maximum 150 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your reference for the legal entity, maximum 150 characters.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * soleProprietorship
   *
   * @param soleProprietorship
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity soleProprietorship(SoleProprietorship soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
    return this;
  }

  /**
   * soleProprietorship
   * @return soleProprietorship
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SoleProprietorship getSoleProprietorship() {
    return soleProprietorship;
  }

  /**
   * soleProprietorship
   *
   * @param soleProprietorship
   */ 
  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoleProprietorship(SoleProprietorship soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
  }

  /**
   * List of transfer instruments that the legal entity owns.
   *
   * @param transferInstruments
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity transferInstruments(List<TransferInstrumentReference> transferInstruments) {
    this.transferInstruments = transferInstruments;
    return this;
  }

  public LegalEntity addTransferInstrumentsItem(TransferInstrumentReference transferInstrumentsItem) {
    if (this.transferInstruments == null) {
      this.transferInstruments = new ArrayList<>();
    }
    this.transferInstruments.add(transferInstrumentsItem);
    return this;
  }

  /**
   * List of transfer instruments that the legal entity owns.
   * @return transferInstruments
   */
  @ApiModelProperty(value = "List of transfer instruments that the legal entity owns.")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TransferInstrumentReference> getTransferInstruments() {
    return transferInstruments;
  }

  /**
   * List of transfer instruments that the legal entity owns.
   *
   * @param transferInstruments
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstruments(List<TransferInstrumentReference> transferInstruments) {
    this.transferInstruments = transferInstruments;
  }

  /**
   * trust
   *
   * @param trust
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity trust(Trust trust) {
    this.trust = trust;
    return this;
  }

  /**
   * trust
   * @return trust
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Trust getTrust() {
    return trust;
  }

  /**
   * trust
   *
   * @param trust
   */ 
  @JsonProperty(JSON_PROPERTY_TRUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrust(Trust trust) {
    this.trust = trust;
  }

  /**
   * The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**.
   *
   * @param type
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**.
   * @return type
   */
  @ApiModelProperty(value = "The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The type of legal entity.  Possible values: **individual**, **organization**, **soleProprietorship**, or **trust**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * unincorporatedPartnership
   *
   * @param unincorporatedPartnership
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity unincorporatedPartnership(UnincorporatedPartnership unincorporatedPartnership) {
    this.unincorporatedPartnership = unincorporatedPartnership;
    return this;
  }

  /**
   * unincorporatedPartnership
   * @return unincorporatedPartnership
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNINCORPORATED_PARTNERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UnincorporatedPartnership getUnincorporatedPartnership() {
    return unincorporatedPartnership;
  }

  /**
   * unincorporatedPartnership
   *
   * @param unincorporatedPartnership
   */ 
  @JsonProperty(JSON_PROPERTY_UNINCORPORATED_PARTNERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnincorporatedPartnership(UnincorporatedPartnership unincorporatedPartnership) {
    this.unincorporatedPartnership = unincorporatedPartnership;
  }

  /**
   * List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved.
   *
   * @param verificationDeadlines
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity verificationDeadlines(List<VerificationDeadline> verificationDeadlines) {
    this.verificationDeadlines = verificationDeadlines;
    return this;
  }

  public LegalEntity addVerificationDeadlinesItem(VerificationDeadline verificationDeadlinesItem) {
    if (this.verificationDeadlines == null) {
      this.verificationDeadlines = new ArrayList<>();
    }
    this.verificationDeadlines.add(verificationDeadlinesItem);
    return this;
  }

  /**
   * List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved.
   * @return verificationDeadlines
   */
  @ApiModelProperty(value = "List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved.")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_DEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<VerificationDeadline> getVerificationDeadlines() {
    return verificationDeadlines;
  }

  /**
   * List of verification deadlines and the capabilities that will be disallowed if verification errors are not resolved.
   *
   * @param verificationDeadlines
   */ 
  @JsonProperty(JSON_PROPERTY_VERIFICATION_DEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationDeadlines(List<VerificationDeadline> verificationDeadlines) {
    this.verificationDeadlines = verificationDeadlines;
  }

  /**
   * A key-value pair that specifies the verification process for a legal entity. Set to **upfront** for upfront verification for [marketplaces](https://docs.adyen.com/marketplaces/verification-overview/verification-types/#upfront-verification).
   *
   * @param verificationPlan
   * @return the current {@code LegalEntity} instance, allowing for method chaining
   */
  public LegalEntity verificationPlan(String verificationPlan) {
    this.verificationPlan = verificationPlan;
    return this;
  }

  /**
   * A key-value pair that specifies the verification process for a legal entity. Set to **upfront** for upfront verification for [marketplaces](https://docs.adyen.com/marketplaces/verification-overview/verification-types/#upfront-verification).
   * @return verificationPlan
   */
  @ApiModelProperty(value = "A key-value pair that specifies the verification process for a legal entity. Set to **upfront** for upfront verification for [marketplaces](https://docs.adyen.com/marketplaces/verification-overview/verification-types/#upfront-verification).")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVerificationPlan() {
    return verificationPlan;
  }

  /**
   * A key-value pair that specifies the verification process for a legal entity. Set to **upfront** for upfront verification for [marketplaces](https://docs.adyen.com/marketplaces/verification-overview/verification-types/#upfront-verification).
   *
   * @param verificationPlan
   */ 
  @JsonProperty(JSON_PROPERTY_VERIFICATION_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationPlan(String verificationPlan) {
    this.verificationPlan = verificationPlan;
  }

  /**
   * Return true if this LegalEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalEntity legalEntity = (LegalEntity) o;
    return Objects.equals(this.capabilities, legalEntity.capabilities) &&
        Objects.equals(this.documentDetails, legalEntity.documentDetails) &&
        Objects.equals(this.documents, legalEntity.documents) &&
        Objects.equals(this.entityAssociations, legalEntity.entityAssociations) &&
        Objects.equals(this.id, legalEntity.id) &&
        Objects.equals(this.individual, legalEntity.individual) &&
        Objects.equals(this.organization, legalEntity.organization) &&
        Objects.equals(this.problems, legalEntity.problems) &&
        Objects.equals(this.reference, legalEntity.reference) &&
        Objects.equals(this.soleProprietorship, legalEntity.soleProprietorship) &&
        Objects.equals(this.transferInstruments, legalEntity.transferInstruments) &&
        Objects.equals(this.trust, legalEntity.trust) &&
        Objects.equals(this.type, legalEntity.type) &&
        Objects.equals(this.unincorporatedPartnership, legalEntity.unincorporatedPartnership) &&
        Objects.equals(this.verificationDeadlines, legalEntity.verificationDeadlines) &&
        Objects.equals(this.verificationPlan, legalEntity.verificationPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, documentDetails, documents, entityAssociations, id, individual, organization, problems, reference, soleProprietorship, transferInstruments, trust, type, unincorporatedPartnership, verificationDeadlines, verificationPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntity {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    entityAssociations: ").append(toIndentedString(entityAssociations)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    soleProprietorship: ").append(toIndentedString(soleProprietorship)).append("\n");
    sb.append("    transferInstruments: ").append(toIndentedString(transferInstruments)).append("\n");
    sb.append("    trust: ").append(toIndentedString(trust)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unincorporatedPartnership: ").append(toIndentedString(unincorporatedPartnership)).append("\n");
    sb.append("    verificationDeadlines: ").append(toIndentedString(verificationDeadlines)).append("\n");
    sb.append("    verificationPlan: ").append(toIndentedString(verificationPlan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of LegalEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LegalEntity
   * @throws JsonProcessingException if the JSON string is invalid with respect to LegalEntity
   */
  public static LegalEntity fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, LegalEntity.class);
  }
/**
  * Convert an instance of LegalEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
