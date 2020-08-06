package com.amarendra.project.rentmanagement;

public class ApiPaths {
    public static final String API_PATH = "/api/v1";

    public static final String TENANT_SERVICE = "/tenant-service";
    public static final String LANDLORD_SERVICE = "/landlord-service";
    public static final String PROPERTY_SERVICE = "/property-service";
    public static final String RENT_SERVICE = "/rent-service";

    public static final String OPERATIONS_SERVICE = "/operations-service";


    public static final String ID = "id";
    public static final String ID_PATH = "/{" + ID + "}";
    public static final String ADD_PATH = "/add";
    public static final String FIND_PATH = "/get";
    public static final String UPDATE_PATH = "/update";
    public static final String FIND_ALL_PATH = "/get-all";

    public static final String LANDLORD_ID = "landlordId";
    public static final String LANDLORD_ID_PATH = "/{" + LANDLORD_ID + "}";

}
