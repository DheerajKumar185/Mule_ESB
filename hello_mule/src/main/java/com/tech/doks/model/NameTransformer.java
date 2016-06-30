package com.tech.doks.model;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class NameTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		if (src instanceof String) {
			String name = ((String) src);
			System.out.println("name---> " + name);
			if (name.charAt(0) == '/') {
				System.out.println("name.substring(1)---> " + name.substring(1));
				return name.substring(1);
			}
		}
		return src;
	}
}