package com.tech.doks.mule.filter;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.routing.filter.Filter;

public class InputDataValidator implements Filter {

	@Override
	public boolean accept(MuleMessage message) {
		Map<String, Object> payloadMap = (Map<String, Object>) message.getPayload();
		if(payloadMap != null) {
			System.out.println(payloadMap.toString());
		}
		if (!payloadMap.containsKey("email"))
			throw new NullPointerException("email is missing" + "\n"
					+ payloadMap.toString());
		if (Integer.parseInt(payloadMap.get("item units").toString()) < 1)
			throw new IllegalArgumentException(
					"item units is not less than 0" + "\n"
							+ payloadMap.toString());
		if (Integer.parseInt(payloadMap.get("item price per unit").toString()) < 0)
			throw new IllegalArgumentException(
					"item price per unit is negative" + "\n"
							+ payloadMap.toString());

		return true;
	}

}