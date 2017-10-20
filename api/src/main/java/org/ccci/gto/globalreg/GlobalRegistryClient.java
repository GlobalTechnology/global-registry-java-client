package org.ccci.gto.globalreg;

import org.ccci.gto.globalreg.serializer.SerializerException;
import org.joda.time.ReadableInstant;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

public interface GlobalRegistryClient {
    String PATH_ENTITIES = "entities";
    String PATH_ENTITY_TYPES = "entity_types";
    String PATH_MEASUREMENT_TYPES = "measurement_types";
    String PATH_SYSTEMS = "systems";
    String PARAM_ENTITY_TYPE = "entity_type";
    String PARAM_PAGE = "page";
    String PARAM_PER_PAGE = "per_page";
    String PARAM_FILTER = "filters";
    String PARAM_FIELDS = "fields";
    String PARAM_FULL_RESPONSE = "full_response";
    String PARAM_REQUIRE_MDM = "require_mdm";

    /* Entity Endpoints */

    /**
     * Retrieve an entity from the Global Registry
     *
     * @param type    the type of entity to retrieve
     * @param id      the id of the entity being retrieved
     * @param ownedBy the system id the entity is being retrieved for
     * @param filters any filters for the data being returned
     * @return The entity that is stored in the Global Registry, or null if it doesn't exist
     * @throws GlobalRegistryException Thrown when there is an error retrieving the entity.
     * @throws UnauthorizedException   Thrown when the request is unauthorized.
     * @throws SerializerException     Thrown when there was an exception with entity deserialization.
     */
    <T> T getEntity(Type<T> type, String id, String ownedBy, Filter... filters) throws GlobalRegistryException;
    <T> T getEntity(Type<T> type, String id, String ownedBy, Set<String> fields, Filter... filters) throws GlobalRegistryException;

    /**
     * Retrieve an entity from the Global Registry
     *
     * @param type    the type of entity to retrieve
     * @param id      the id of the entity being retrieved
     * @param filters any filters for the data being returned
     * @return The entity that is stored in the Global Registry, or null if it doesn't exist
     * @throws GlobalRegistryException Thrown when there is an error retrieving the entity.
     * @throws UnauthorizedException   Thrown when the request is unauthorized.
     * @throws SerializerException     Thrown when there was an exception with entity deserialization.
     */
    <T> T getEntity(Type<T> type, String id, Filter... filters) throws GlobalRegistryException;
    <T> T getEntity(Type<T> type, String id, Set<String> fields, Filter... filters) throws GlobalRegistryException;

    <T> ResponseList<T> getEntities(Type<T> type, String ownedBy, Filter... filters) throws GlobalRegistryException;
    <T> ResponseList<T> getEntities(Type<T> type, String ownedBy, Set<String> fields, Filter... filters) throws GlobalRegistryException;

    <T> ResponseList<T> getEntities(Type<T> type, String ownedBy, int page,
                                    Filter... filters) throws GlobalRegistryException;

    <T> ResponseList<T> getEntities(Type<T> type, String ownedBy, int page, int perPage,
                                    Filter... filters) throws GlobalRegistryException;

    <T> ResponseList<T> getEntities(Type<T> type, Filter... filters) throws GlobalRegistryException;

    <T> ResponseList<T> getEntities(Type<T> type, int page, Filter... filters) throws GlobalRegistryException;

    <T> ResponseList<T> getEntities(Type<T> type, int page, int perPage,
                                    Filter... filters) throws GlobalRegistryException;

    <T> ResponseList<T> getEntities(Type<T> type, int page, int perPage, Set<String> fields,
                                    Filter... filters) throws GlobalRegistryException;

    /**
     * Store an entity in the Global Registry
     *
     * @param type   The type of entity to add
     * @param entity The actual entity to store in the Global Registry
     * @return the entity stored in the Global Registry
     * @throws GlobalRegistryException Thrown when there is an error adding the entity.
     * @throws UnauthorizedException   Thrown when the request is unauthorized.
     */
    <T> T addEntity(@Nonnull Type<T> type, @Nonnull T entity) throws GlobalRegistryException;

    <T> T addEntity(@Nonnull Type<T> type, @Nonnull T entity, Set<String> fields) throws GlobalRegistryException;

    <T> T addEntity(@Nonnull Type<T> type, @Nonnull T entity, Set<String> fields, boolean requireMdm)
            throws GlobalRegistryException;

    <T> T updateEntity(@Nonnull Type<T> type, @Nonnull String id, @Nonnull T entity) throws GlobalRegistryException;

    <T> T updateEntity(@Nonnull Type<T> type, @Nonnull String id, @Nonnull T entity, Set<String> fields)
            throws GlobalRegistryException;

    <T> T updateEntity(@Nonnull Type<T> type, @Nonnull String id, @Nonnull T entity, Set<String> fields,
                       boolean requireMdm) throws GlobalRegistryException;

    void deleteEntity(@Nonnull String id) throws GlobalRegistryException;

    @Deprecated
    <T> void deleteEntity(@Nullable Type<T> type, @Nonnull String id) throws GlobalRegistryException;

    /* Entity Type Endpoints */

    ResponseList<EntityType> getEntityTypes(Filter... filters) throws GlobalRegistryException;

    ResponseList<EntityType> getEntityTypes(int page, Filter... filters) throws GlobalRegistryException;

    EntityType addEntityType(EntityType type) throws GlobalRegistryException;

    /* System Endpoints */

    @Nonnull
    RegisteredSystem getSystem(String id) throws GlobalRegistryException;

    @Nonnull
    List<RegisteredSystem> getSystems() throws GlobalRegistryException;

    /* Measurement Endpoints */

    ResponseList<MeasurementType> getMeasurementTypes(Filter... filters) throws GlobalRegistryException;

    ResponseList<MeasurementType> getMeasurementTypes(int page, Filter... filters) throws GlobalRegistryException;

    MeasurementType getMeasurementType(String id, Filter... filters) throws GlobalRegistryException;

    List<Measurement> getMeasurements(MeasurementType type, ReadableInstant from, ReadableInstant to,
                                      Filter... filters) throws GlobalRegistryException;

    List<Measurement> getMeasurements(String type, ReadableInstant from, ReadableInstant to,
                                      Filter... filters) throws GlobalRegistryException;

    List<Measurement> getMeasurements(MeasurementType type, Filter... filters) throws GlobalRegistryException;

    List<Measurement> getMeasurements(String type, Filter... filters) throws GlobalRegistryException;
}
