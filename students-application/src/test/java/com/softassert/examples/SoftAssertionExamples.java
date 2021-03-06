/**
 * Soft Assertion
 */
package com.softassert.examples;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

/**
 * @author Renata.Vieira
 *
 */
public class SoftAssertionExamples {

	@Test
	public void hardAsserts(){
		RestAssured.given()
		.when()
		.get("http://localhost:8085/student/list")
		.then()
		.body("[0].firstName", equalTo("Vernon"))
		.body("[0].lastName", equalTo("Harper"))
		.body("[0].email", equalTo("egestas.rhoncus.Proin@massaQuisqueporttitor.org"))
		.body("[0].programme", equalTo("Financial Analysis"));
	}

	@Test
	public void softAsserts(){
		RestAssured.given()
		.when()
		.get("http://localhost:8085/student/list")
		.then()
		.body("[0].firstName", equalTo("Vernon"),
				"[0].lastName", equalTo("Harper"),
				"[0].email",equalTo("egestas.rhoncus.Proin@massaQuisqueporttitor.org"),
				"[0].programme", equalTo("Financial Analysis"));
	}
}
