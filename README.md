# learnJacksonAPI
the dependency required for JACKSON use is 
**<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
</dependency>**

Jackson APIs helps to serialize and deserilize java objects to xml/json and vice-versa.

ObjectMapper mapper = new ObjectMapper();
mapper.enable(SerializationFeature.INDENT_OUTPUT)

# the objectmapper uses getter and setter of the POJO class and set the value to the object, when deserilizing from json file to class.
@JsonIgnoreProperties(ignoreUnknown = true) --> ignore the properties from the json ( properties not present in class).
Example :- 

{
"name": "Alok",
"isActive": true,
"phoneNo": ["123456","67890"],
"batch": {
	"batchName": "Spring",
	"trainer": "Akash"
}
}

whener we are deserilizing objectmapper user getter/setter for boolean also checks getter and setter also with name get** and set**

@JsonProperty --> Specify the property from json file/json



