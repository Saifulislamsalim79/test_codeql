package org.org.org.org.android.util.asm;

import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
/* loaded from: classes.dex */
public final class ByteVector implements e.a.a.a.f.z.b<e.a.a.a.a.b.f.e> {
    private ByteVector() {
    }

    public /* synthetic */ ByteVector(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1350a(JSONObject jSONObject) {
        C14547m $r1 = onCreateView(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public C14547m m1352a(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        C14547m $r3 = (C14547m) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14547m m1351a(String str, boolean z, C14544h c14544h, C14542f c14542f, List list, float f) {
        Log_OC.getArray(str, "gestureId");
        Log_OC.getArray(c14544h, "frame");
        Log_OC.getArray(c14542f, "location");
        Log_OC.getArray(list, "touches");
        Float $r6 = Float.valueOf(f);
        C14547m $r5 = new C14547m("PINCH", z, c14544h, c14542f, list, str, 0, null, null, null, null, null, null, $r6, null, null, 57280, null);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14547m m1349a(C14544h c14544h, C14542f c14542f, List list) {
        Log_OC.getArray(c14544h, "frame");
        Log_OC.getArray(c14542f, "location");
        Log_OC.getArray(list, "touches");
        C14547m $r4 = new C14547m("DOUBLE_TAP", true, c14544h, c14542f, list, null, 2, null, null, null, null, null, null, null, null, null, 65440, null);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14547m m1348a(C14544h c14544h, C14542f c14542f, List list, float f, C14545i c14545i) {
        Log_OC.getArray(c14544h, "frame");
        Log_OC.getArray(c14542f, "location");
        Log_OC.getArray(list, "touches");
        Log_OC.getArray(c14545i, "velocityVector");
        Float $r6 = Float.valueOf(f);
        C14547m $r5 = new C14547m("PAN", true, c14544h, c14542f, list, null, 0, null, $r6, c14545i, null, null, null, null, null, null, 64736, null);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1347b(String str) {
        C14547m $r1 = m1352a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final C14547m m1346b(String str, boolean z, C14544h c14544h, C14542f c14542f, List list, float f) {
        Log_OC.getArray(str, "gestureId");
        Log_OC.getArray(c14544h, "frame");
        Log_OC.getArray(c14542f, "location");
        Log_OC.getArray(list, "touches");
        Float $r6 = Float.valueOf(0.0f);
        Float $r7 = Float.valueOf(f);
        C14547m $r5 = new C14547m("ROTATION", z, c14544h, c14542f, list, str, 0, null, null, null, $r6, $r7, null, null, null, null, 62400, null);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14547m get(C14544h c14544h, C14542f c14542f, List list) {
        Log_OC.getArray(c14544h, "frame");
        Log_OC.getArray(c14542f, "location");
        Log_OC.getArray(list, "touches");
        C14547m $r4 = new C14547m("LONG_PRESS", true, c14544h, c14542f, list, null, 0, null, null, null, null, null, null, null, null, null, 65504, null);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a5, code lost:
        if (r30 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.org.org.org.android.util.asm.C14547m onCreateView(org.json.JSONObject r46) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.asm.ByteVector.onCreateView(org.json.JSONObject):org.org.org.org.android.util.asm.m");
    }
}
