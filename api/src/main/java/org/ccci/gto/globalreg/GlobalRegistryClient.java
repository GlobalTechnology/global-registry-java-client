package org.ccci.gto.globalreg;

import org.ccci.gto.globalreg.serializer.SerializerException;

public interface GlobalRegistryClient {
    public static final String PATH_ENTITIES = "entities";
    public static final String PATH_ENTITY_TYPES = "entity_types";
    public static final String PARAM_CREATED_BY = "created_by";
    public static final String PARAM_ENTITY_TYPE = "entity_type";
    public static final String PARAM_PAGE = "page";
    public static final String PARAM_FILTER = "filters";

    /* Entity Endpoints */

    /**
     * Retrieve an entity from the Global Registry
     *
     * @param type the type of entity to retrieve
     * @param id   the id of the entity being retrieved
     * @return The entity that is stored in the Global Registry
     * @throws UnauthorizedException Thrown when the request is unauthorized.
     * @throws SerializerException   Thrown when there was an exception with entity deserialization.
     */
    <T> T getEntity(Type<T> type, int id) throws GlobalRegistryException;

    /**
     * Retrieve an entity from the Global Registry
     *
     * @param type      the type of entity to retrieve
     * @param id        the id of the entity being retrieved
     * @param createdBy the system id the entity is being retrieved for
     * @return The entity that is stored in the Global Registry
     * @throws UnauthorizedException Thrown when the request is unauthorized.
     * @throws SerializerException   Thrown when there was an exception with entity deserialization.
     */
    <T> T getEntity(Type<T> type, int id, String createdBy) throws SerializerException, UnauthorizedException;

    <T> ResponseList<T> getEntities(Type<T> type, Filter... filters) throws UnauthorizedException, SerializerException;

    <T> ResponseList<T> getEntities(Type<T> type, int page, Filter... filters) throws UnauthorizedException, SerializerException;

    <T> ResponseList<T> getEntities(Type<T> type, String createdBy, Filter... filters) throws UnauthorizedException, SerializerException;

    <T> ResponseList<T> getEntities(Type<T> type, String createdBy, int page,
                                    Filter... filters) throws UnauthorizedException, SerializerException;

    /**
     * Store an entity in the Global Registry
     *
     * @param type   The type of entity to add
     * @param entity The actual entity to store in the Global Registry
     * @return the entity stored in the Global Registry
     * @throws UnauthorizedException Thrown when the request is unauthorized.
     */
    <T> T addEntity(Type<T> type, T entity) throws UnauthorizedException, SerializerException;

    <T> T updateEntity(Type<T> type, int id, T entity) throws UnauthorizedException, SerializerException;

    <T> void deleteEntity(Type<T> type, int id) throws UnauthorizedException;

    /* Entity Type Endpoints */

    ResponseList<EntityType> getEntityTypes(Filter... filters) throws UnauthorizedException, SerializerException;

    ResponseList<EntityType> getEntityTypes(int page, Filter... filters) throws UnauthorizedException, SerializerException;

    EntityType addEntityType(EntityType type) throws UnauthorizedException, SerializerException;
}
