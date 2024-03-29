package hapi.fhir.client.controller;



import org.hl7.fhir.instance.model.api.IIdType;
import org.hl7.fhir.r4.model.Condition;


import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import hapi.fhir.client.utils.RandomGenerator;

public class CondiationController {

	/**
	 * Create a context and set the client. Both are heavy resources, so it makes
	 * sense to create them once.
	 */
	private static final FhirContext CTX = FhirContext.forR5();
	private static final IGenericClient CLIENT = CTX.newRestfulGenericClient("http://localhost:8080/fhir");

	public CondiationController() {
	}

	public void readCondiation() {
		Condition condiation;
		// This should give you Max Mustermann back.
		try {
			condiation = CLIENT.read().resource(Condition.class).withId("1").execute();
			String string = CTX.newJsonParser().setPrettyPrint(true).encodeResourceToString(condiation);
			System.out.println(string);
		} catch (ResourceNotFoundException e) {
			System.out.println("Resource not found!");
		}
		// This should fail!
		try {
			condiation = CLIENT.read().resource(Condition.class).withId(RandomGenerator.generateRandomID()).execute();
			String string = CTX.newJsonParser().setPrettyPrint(true).encodeResourceToString(condiation);
			System.out.println(string);
		} catch (ResourceNotFoundException e) {
			System.err.println("Resource not found!");
			System.out.println("Previous Result should be NOT FOUND :)");
		}
	}

	public void createNewCondiation() {
		Condition newCondiation = new Condition();
		/**
		 * Invoke the server create method (and send pretty-printed JSON encoding to the
		 * server. The MethodOutcome object will contain information about the response
		 * from the server, including the ID of the created resource, the
		 * OperationOutcome response, etc...
		 */
		MethodOutcome outcome = CLIENT.create().resource(newCondiation).prettyPrint().encodedJson().execute();
		IIdType id = outcome.getId();
		System.out.println("Created Condiation, got ID: " + id);
		readCondiationByID(id);
	}

	public static void readCondiationByID(IIdType id) {
		Condition condiation;
		try {
			condiation = CLIENT.read().resource(Condition.class).withId(id.getValue()).execute();

		} catch (ResourceNotFoundException e) {
			System.out.println("Resource not found!");
		}
	}



}
