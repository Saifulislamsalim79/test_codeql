package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: AbtExperimentInfo.java */
/* renamed from: com.google.firebase.abt.a */
/* loaded from: classes2.dex */
public class C5170a {

    /* renamed from: g */
    private static final String[] f12877g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    static final DateFormat f12878h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    private final String f12879a;

    /* renamed from: b */
    private final String f12880b;

    /* renamed from: c */
    private final String f12881c;

    /* renamed from: d */
    private final Date f12882d;

    /* renamed from: e */
    private final long f12883e;

    /* renamed from: f */
    private final long f12884f;

    public C5170a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f12879a = str;
        this.f12880b = str2;
        this.f12881c = str3;
        this.f12882d = date;
        this.f12883e = j;
        this.f12884f = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5170a m25474a(Map<String, String> map) throws AbtException {
        m25468g(map);
        try {
            return new C5170a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f12878h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m25469f(C5170a c5170a) throws AbtException {
        m25468g(c5170a.m25470e());
    }

    /* renamed from: g */
    private static void m25468g(Map<String, String> map) throws AbtException {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f12877g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m25473b() {
        return this.f12879a;
    }

    /* renamed from: c */
    long m25472c() {
        return this.f12882d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC5174a.C5177c m25471d(String str) {
        InterfaceC5174a.C5177c c5177c = new InterfaceC5174a.C5177c();
        c5177c.f12894a = str;
        c5177c.f12906m = m25472c();
        c5177c.f12895b = this.f12879a;
        c5177c.f12896c = this.f12880b;
        c5177c.f12897d = TextUtils.isEmpty(this.f12881c) ? null : this.f12881c;
        c5177c.f12898e = this.f12883e;
        c5177c.f12903j = this.f12884f;
        return c5177c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> m25470e() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f12879a);
        hashMap.put("variantId", this.f12880b);
        hashMap.put("triggerEvent", this.f12881c);
        hashMap.put("experimentStartTime", f12878h.format(this.f12882d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.f12883e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f12884f));
        return hashMap;
    }
}
