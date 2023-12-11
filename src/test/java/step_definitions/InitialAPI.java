package step_definitions;

public class InitialAPI {
    public static final String URL = "https://dummyjson.com";
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

    //  Carts
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

    //  Users
    //  Get all users
    public static final String Get_all_users = URL + "/users";
//    Get a single user
    public static final String Get_a_single_user = URL + "/users/1";
//    Search users
    public static final String Search_users = URL + "/users/search?q=John";
//    Filter users
    public static final String Filter_users = URL + "/users/search?q=John";
//    Limit and skip users
    public static final String Limit_and_skip_users = URL + "/users?limit=5&skip=10&select=firstName,age";
//    Get user's carts by user id
    public static final String Get_users_carts_by_user_id = URL + "/users/5/carts";
//    Get user's posts by user id
    public static final String Get_users_post_by_user_id = URL + "/users/5/posts";
//    Get user's todos by user id
    public static final String Get_users_todos_by_user_id = URL + "/users/5/todos";
//    Add a new user
    public static final String Add_a_new_user = URL + "/users/add";
//    Update a user
    public static final String Update_a_user = URL + "/users/1";
//    Delete a user
    public static final String Delete_a_user = URL + "/users/1";


//    Posts
//    Get all posts
    public static final String Get_all_posts = URL + "/posts";
//    Get a single post
    public static final String Get_a_single_post = URL + "/posts/1";
//    Search posts
    public static final String Search_posts = URL + "/posts/search?q=love";
//    Limit and skip posts
    public static final String Limit_and_skip_posts = URL + "/posts?limit=10&skip=10&select=title,reactions,userId";
//    Get all posts by user id
    public static final String Get_all_posts_by_user_id = URL + "/posts/user/5";
//    Get post's comments
    public static final String Get_posts_comments = URL + "/posts/1/comments";
//    Add a new post
    public static final String Add_a_new_post = URL + "/posts/add";
//    Update a post
    public static final String Update_a_post = URL + "/posts/1";
//    Delete a post
    public static final String Delete_a_post = URL + "/posts/1";


//    Comments
//      Get all comments
    public static final String Get_all_comments = URL + "/comments";
//    Get a single comment
    public static final String Get_a_single_comment = URL + "/comments/1";
//    Limit and skip comments
    public static final String Limit_and_skip_comments = URL + "/comments?limit=10&skip=10&select=body,postId";
//    Get all comments by post id
    public static final String Get_all_comments_by_post_id = URL + "/comments/post/5";
//    Add a new comment
    public static final String Add_a_new_comment = URL + "/comments/add";
//    Update a comment
    public static final String Update_a_comment = URL + "/comments/1";
//    Delete a comment
    public static final String Delete_a_comment = URL + "/comments/1";




















}
