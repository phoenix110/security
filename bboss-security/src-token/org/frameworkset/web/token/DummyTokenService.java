package org.frameworkset.web.token;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class DummyTokenService implements TokenServiceInf {

	public DummyTokenService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String genToken(ServletRequest request, String fid, boolean cache,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDToken(String elementType, HttpServletRequest request,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDToken(String elementType, String jsonsplit, HttpServletRequest request, String fid,boolean sign)
			throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTokenfailpath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TokenResult checkTicket(String appid, String secret, String ticket,boolean sign) throws TokenException {
		TokenResult result = new TokenResult();
		return result;
	}

	@Override
	public TokenResult checkToken(String appid, String secret, String token,boolean sign) throws TokenException {
		TokenResult result = new TokenResult();
		return result;
	}

	@Override
	public String buildHiddenDToken(HttpServletRequest request,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String appendDTokenToURL(HttpServletRequest request, String url,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return url;
	}

	@Override
	public String buildJsonDToken(String jsonsplit, HttpServletRequest request,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildParameterDToken(HttpServletRequest request,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDToken(HttpServletRequest request,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDToken(String elementType, String jsonsplit, HttpServletRequest request, String fid,
			boolean cache,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String genTempToken(boolean sign) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String genDualToken(String appid, String secret, String ticket, long dualtime,boolean sign) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String genDualTokenWithDefaultLiveTime(String appid, String secret, String ticket,boolean sign) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String genAuthTempToken(String appid, String secret, String ticket,boolean sign) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket genTicket(String account, String worknumber, String appid, String secret,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnableToken() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSecret() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAppid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean destroyTicket(String ticket, String appid, String secret) throws TokenException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean refreshTicket(String ticket, String appid, String secret) throws TokenException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int checkTempToken(String token,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return TokenStore.token_request_validateresult_notenabletoken;
	}

	@Override
	public Ticket genTempTicket(String account, String worknumber, String appid, String secret,boolean sign) throws TokenException {
		// TODO Auto-generated method stub
		return null;
	}

}
