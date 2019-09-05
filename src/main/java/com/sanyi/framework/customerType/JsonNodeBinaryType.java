package com.sanyi.framework.customerType;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author Vlad MIhalcea
 */
public class JsonNodeBinaryType
	extends AbstractSingleColumnStandardBasicType<JsonNode> {

	public JsonNodeBinaryType() {
		super( JsonBinarySqlTypeDescriptor.INSTANCE, JsonNodeTypeDescriptor.INSTANCE );
	}

	public String getName() {
		return "jsonb-node";
	}
}