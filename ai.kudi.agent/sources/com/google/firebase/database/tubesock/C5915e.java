package com.google.firebase.database.tubesock;

import android.util.Base64;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: WebSocketHandshake.java */
/* renamed from: com.google.firebase.database.tubesock.e */
/* loaded from: classes2.dex */
class C5915e {

    /* renamed from: a */
    private URI f14524a;

    /* renamed from: b */
    private String f14525b;

    /* renamed from: c */
    private String f14526c;

    /* renamed from: d */
    private Map<String, String> f14527d;

    public C5915e(URI uri, String str, Map<String, String> map) {
        this.f14524a = null;
        this.f14525b = null;
        this.f14526c = null;
        this.f14527d = null;
        this.f14524a = uri;
        this.f14525b = str;
        this.f14527d = map;
        this.f14526c = m23326a();
    }

    /* renamed from: a */
    private String m23326a() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) m23323d(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: b */
    private String m23325b(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            str = str + str2 + ": " + linkedHashMap.get(str2) + "\r\n";
        }
        return str;
    }

    /* renamed from: d */
    private int m23323d(int i, int i2) {
        double random = Math.random();
        double d = i2;
        Double.isNaN(d);
        double d2 = i;
        Double.isNaN(d2);
        return (int) ((random * d) + d2);
    }

    /* renamed from: c */
    public byte[] m23324c() {
        String path = this.f14524a.getPath();
        String query = this.f14524a.getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(query == null ? "" : "?" + query);
        String sb2 = sb.toString();
        String host = this.f14524a.getHost();
        if (this.f14524a.getPort() != -1) {
            host = host + ":" + this.f14524a.getPort();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f14526c);
        String str = this.f14525b;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map<String, String> map = this.f14527d;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, this.f14527d.get(str2));
                }
            }
        }
        byte[] bytes = ((("GET " + sb2 + " HTTP/1.1\r\n") + m23325b(linkedHashMap)) + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    /* renamed from: e */
    public void m23322e(HashMap<String, String> hashMap) {
        if ("websocket".equals(hashMap.get("upgrade"))) {
            if (!"upgrade".equals(hashMap.get("connection"))) {
                throw new WebSocketException("connection failed: missing header field in server handshake: Connection");
            }
            return;
        }
        throw new WebSocketException("connection failed: missing header field in server handshake: Upgrade");
    }

    /* renamed from: f */
    public void m23321f(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new WebSocketException("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new WebSocketException("connection failed: 404 not found");
        }
        if (parseInt == 101) {
            return;
        }
        throw new WebSocketException("connection failed: unknown status code " + parseInt);
    }
}
