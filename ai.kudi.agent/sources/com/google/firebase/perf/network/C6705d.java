package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: InstrHttpsURLConnection.java */
/* renamed from: com.google.firebase.perf.network.d */
/* loaded from: classes2.dex */
public final class C6705d extends HttpsURLConnection {

    /* renamed from: a */
    private final C6706e f16124a;

    /* renamed from: b */
    private final HttpsURLConnection f16125b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6705d(HttpsURLConnection httpsURLConnection, C6637h c6637h, C6695b c6695b) {
        super(httpsURLConnection.getURL());
        this.f16125b = httpsURLConnection;
        this.f16124a = new C6706e(httpsURLConnection, c6637h, c6695b);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f16124a.m21021a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f16124a.m21019b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f16124a.m21017c();
    }

    public boolean equals(Object obj) {
        return this.f16124a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f16124a.m21016d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f16125b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f16124a.m21015e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f16124a.m21014f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f16124a.m21012h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f16124a.m21011i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f16124a.m21010j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f16124a.m21009k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f16124a.m21008l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f16124a.m21007m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f16124a.m21006n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f16124a.m21005o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f16124a.m21004p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f16124a.m21003q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f16124a.m21002r(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f16124a.m21000t(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f16124a.m20999u(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f16124a.m20998v(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.f16124a.m20997w(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f16124a.m20996x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f16125b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f16124a.m20995y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f16124a.m20994z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f16124a.m21047A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f16124a.m21046B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f16125b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f16125b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f16124a.m21045C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f16125b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f16124a.m21044D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f16124a.m21043E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f16124a.m21042F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f16124a.m21041G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f16124a.m21040H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f16124a.m21039I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f16124a.m21038J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f16125b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f16125b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f16124a.m21037K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f16124a.m21036L();
    }

    public int hashCode() {
        return this.f16124a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f16124a.m21035M(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.f16124a.m21034N(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f16124a.m21033O(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f16124a.m21032P(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f16124a.m21031Q(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f16124a.m21030R(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.f16124a.m21029S(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f16125b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f16124a.m21027U(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.f16124a.m21026V(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f16124a.m21025W(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f16124a.m21024X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f16124a.m21023Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f16125b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f16124a.m21022Z(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f16124a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f16124a.m21018b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f16124a.m21013g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f16124a.m21001s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.f16124a.m21028T(j);
    }
}
