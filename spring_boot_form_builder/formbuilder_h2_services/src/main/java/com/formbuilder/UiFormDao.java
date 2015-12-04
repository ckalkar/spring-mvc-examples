package com.formbuilder;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

import com.formbuilder.dto.UiForm;
import com.formbuilder.dto.UiFormLink;
import com.formbuilder.service.RuleValidationOutcome;

public interface UiFormDao {

	public abstract List<UiForm> getFormList(String appName);

	public abstract Map getFormData(String appName, int dataId, UiForm form, List<UiFormLink> formLinks) throws SQLException;

	public abstract UiForm getFormInfo(String appName, int formId);

	public abstract List<UiFormLink> getFormLinkInfo(String appName, int formId);

	public abstract List<Map> getFormDataList(String appName, int formId);

	public abstract List<RuleValidationOutcome> saveFormData(String appName, int formId,int dataId, JSONObject input) throws ParseException, SQLException;

	public abstract JSONObject validate(JSONObject input);

	public abstract Map diaplsyValidate();
	
	public int deleteRow(String appName, int rowId,int formId) throws SQLException;

	public abstract String getApplicationDisplayName(String appName);

}