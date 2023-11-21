package step_definitions;

public class InitialAPI {
    public static final String URL = "https://dummyjson.com/auth";
    public static final String DIR = System.getProperty("user.dir");

    public static final String JSON_REQ_BODY = DIR + "/src/test/resources/JSON/JSONReqBody/";
    public static final String JSON_SCHEMA_VALIDATOR = DIR + "/src/test/resources/JSON/JSONSchemaValidator/";

    //AUTH
    public static final String LOGIN_AND_GET_TOKEN = URL + "/auth/login";


//    Intro
//    Test Route
    public static final String Test_Route = URL + "/auth/login";
//    Limiting Resources
    public static final String Limiting_Resources = URL + "/RESOURCE/?limit=10&skip=5&select=key1&select=key2&select=key3";

//    Products
//    Get all products
    public static final String Get_all_products = URL + "/products";
//    Get a single product
    public static final String Get_a_single_product = URL + "/products/1";
//    Search products
    public static final String Search_products = URL + "/products/search?q=phone";
//    Limit and skip products
    public static final String Limit_and_skip_products = URL + "/products?limit=10&skip=10&select=title,price";
//    Get all products categories
    public static final String Get_all_products_categories = URL + "/products/categories";
//    Get products of a category
    public static final String Get_products_of_a_category = URL + "/products/category/smartphones";
//    Add a new product
    public static final String Add_a_new_product = URL + "/products/add";
//    Update a product
    public static final String Update_a_product = URL + "/products/1";
//    Delete a product
    public static final String Delete_a_product = URL + "/products/1";
//  Get all carts
    public static final String Get_all_carts = URL + "/carts";
//  Get a single cart
    public static final String Get_a_single_cart = URL + "/carts/1";
//  Get carts of a user
    public static final String Get_carts_of_a_user = URL + "/carts/1";
//    Add a new cart
    public static final String Add_a_new_cart = URL + "/carts/add";
//    Update a cart
    public static final String Update_a_cart = URL + "/carts/1";
//    Delete a cart
    public static final String Delete_a_cart = URL + "/carts/1";


}
