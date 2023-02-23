package org.org.org.org.internal.app.api;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* loaded from: classes.dex */
public final class Widget implements Object {

    /* renamed from: a */
    public final String f32420a;

    /* renamed from: b */
    public final String f32421b;

    /* renamed from: c */
    public final String f32422c;

    /* renamed from: d */
    public final String f32423d;

    /* renamed from: f */
    public final String f32424f;

    /* renamed from: g */
    public final String f32425g;
    public final String path;
    public final String version;

    public Widget(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(str2, "visitorId");
        Log_OC.getArray(str3, "sdkPlatform");
        Log_OC.getArray(str4, "sdkVersion");
        Log_OC.getArray(str5, "osVersion");
        Log_OC.getArray(str6, "os");
        Log_OC.getArray(str7, "device");
        Log_OC.getArray(str8, "fingerprint");
        this.path = str;
        this.version = str2;
        this.f32424f = str3;
        this.f32421b = str4;
        this.f32423d = str5;
        this.f32425g = str6;
        this.f32420a = str7;
        this.f32422c = str8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Widget(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.p483e0.p485d.DBUtils$1 r14) {
        /*
            r4 = this;
            r0 = r13 & 4
            java.lang.String r1 = "Android"
            if (r0 == 0) goto L10
            java.lang.String r7 = r1.toLowerCase()
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r2)
            goto L10
        L10:
            r0 = r13 & 8
            if (r0 == 0) goto L1b
            org.org.org.org.asm.http.f r3 = org.org.org.org.asm.http.C14603f.f32359c
            java.lang.String r8 = r3.getText()
            goto L1b
        L1b:
            r0 = r13 & 16
            if (r0 == 0) goto L2b
            org.org.org.org.asm.http.f r3 = org.org.org.org.asm.http.C14603f.f32359c
            java.lang.String r9 = r3.getString()
            java.lang.String r2 = "MetadataUtil.osVersionCode()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r9, r2)
            goto L2b
        L2b:
            r0 = r13 & 32
            if (r0 == 0) goto L32
            java.lang.String r10 = "Android"
            goto L32
        L32:
            r0 = r13 & 64
            if (r0 == 0) goto L3d
            org.org.org.org.asm.http.f r3 = org.org.org.org.asm.http.C14603f.f32359c
            java.lang.String r11 = r3.decode()
            goto L3d
        L3d:
            r13 = r13 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L4d
            org.org.org.org.asm.http.f r3 = org.org.org.org.asm.http.C14603f.f32359c
            java.lang.String r12 = r3.getItem()
            java.lang.String r2 = "MetadataUtil.fingerprint()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r2)
            goto L4d
        L4d:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.internal.app.api.Widget.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.path;
        $r1.put("key", $r2);
        String $r22 = this.version;
        $r1.put("visitorId", $r22);
        String $r23 = this.f32424f;
        $r1.put("sdkPlatform", $r23);
        String $r24 = this.f32421b;
        $r1.put("sdkVersion", $r24);
        String $r25 = this.f32425g;
        $r1.put("os", $r25);
        String $r26 = this.f32423d;
        $r1.put("osVersion", $r26);
        String $r27 = this.f32420a;
        $r1.put("device", $r27);
        String $r28 = this.f32422c;
        $r1.put("fingerprint", $r28);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Widget;
            if ($z0) {
                Widget $r2 = (Widget) obj;
                String $r3 = this.path;
                String $r4 = $r2.path;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.version;
                    String $r42 = $r2.version;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.f32424f;
                        String $r43 = $r2.f32424f;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.f32421b;
                            String $r44 = $r2.f32421b;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.f32423d;
                                String $r45 = $r2.f32423d;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    String $r36 = this.f32425g;
                                    String $r46 = $r2.f32425g;
                                    boolean $z07 = Log_OC.append($r36, $r46);
                                    if ($z07) {
                                        String $r37 = this.f32420a;
                                        String $r47 = $r2.f32420a;
                                        boolean $z08 = Log_OC.append($r37, $r47);
                                        if ($z08) {
                                            String $r38 = this.f32422c;
                                            String $r48 = $r2.f32422c;
                                            boolean $z09 = Log_OC.append($r38, $r48);
                                            return $z09;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = this.path;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        String $r12 = this.version;
        int $i2 = $r12 != null ? $r12.hashCode() : 0;
        int $i13 = ($i12 + $i2) * 31;
        String $r13 = this.f32424f;
        int $i22 = $r13 != null ? $r13.hashCode() : 0;
        int $i14 = ($i13 + $i22) * 31;
        String $r14 = this.f32421b;
        int $i23 = $r14 != null ? $r14.hashCode() : 0;
        int $i15 = ($i14 + $i23) * 31;
        String $r15 = this.f32423d;
        int $i24 = $r15 != null ? $r15.hashCode() : 0;
        int $i16 = ($i15 + $i24) * 31;
        String $r16 = this.f32425g;
        int $i25 = $r16 != null ? $r16.hashCode() : 0;
        int $i17 = ($i16 + $i25) * 31;
        String $r17 = this.f32420a;
        int $i26 = $r17 != null ? $r17.hashCode() : 0;
        int $i18 = ($i17 + $i26) * 31;
        String $r18 = this.f32422c;
        int $i0 = $r18 != null ? $r18.hashCode() : 0;
        return $i18 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CheckRecordingConfigRequest(key=");
        String $r1 = this.path;
        $r2.append($r1);
        $r2.append(", visitorId=");
        String $r12 = this.version;
        $r2.append($r12);
        $r2.append(", sdkPlatform=");
        String $r13 = this.f32424f;
        $r2.append($r13);
        $r2.append(", sdkVersion=");
        String $r14 = this.f32421b;
        $r2.append($r14);
        $r2.append(", osVersion=");
        String $r15 = this.f32423d;
        $r2.append($r15);
        $r2.append(", os=");
        String $r16 = this.f32425g;
        $r2.append($r16);
        $r2.append(", device=");
        String $r17 = this.f32420a;
        $r2.append($r17);
        $r2.append(", fingerprint=");
        String $r18 = this.f32422c;
        $r2.append($r18);
        $r2.append(")");
        String $r19 = $r2.toString();
        return $r19;
    }
}
