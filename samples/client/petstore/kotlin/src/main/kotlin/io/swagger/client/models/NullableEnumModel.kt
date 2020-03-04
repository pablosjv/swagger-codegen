/**
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models


/**
 * 
 * @param enumProp 
 */
data class NullableEnumModel (

    val enumProp: NullableEnumModel.EnumProp? = null
) {
    /**
    * 
    * Values: a,b,`null`
    */
    enum class EnumProp(val value: kotlin.String){
        a("a"),
        b("b"),
        `null`(null);
    }
}