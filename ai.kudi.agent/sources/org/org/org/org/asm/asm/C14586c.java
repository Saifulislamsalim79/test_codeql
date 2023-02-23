package org.org.org.org.asm.asm;

import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* renamed from: org.org.org.org.asm.asm.c */
/* loaded from: classes.dex */
public final class C14586c implements Object {

    /* renamed from: c */
    public static final C14584a f32334c;

    /* renamed from: a */
    public long f32335a;

    /* renamed from: d */
    public long f32336d;

    /* renamed from: e */
    public String f32337e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14584a $r0 = new C14584a(null);
        f32334c = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14586c(int r10, long r11, long r13) {
        /*
            r9 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            java.lang.String r7 = ".jpg"
            r6.append(r7)
            java.lang.String r8 = r6.toString()
            r0 = r9
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.asm.C14586c.<init>(int, long, long):void");
    }

    public C14586c(String str, long j, long j2) {
        Log_OC.getArray(str, "fileName");
        this.f32337e = str;
        this.f32336d = j;
        this.f32335a = j2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static final List m1129b(JSONArray jSONArray) {
        C14584a $r0 = f32334c;
        List $r1 = $r0.m1136a(jSONArray);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1131a() {
        String r1 = this.f32337e;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final long m1130b() {
        long l0 = this.f32336d;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32337e;
        $r1.put("fileName", $r2);
        long $l0 = this.f32336d;
        $r1.put("duration", $l0);
        long $l02 = this.f32335a;
        $r1.put("generalTime", $l02);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getValue() {
        long l0 = this.f32335a;
        return l0;
    }
}
