package org.org.org.org.org.common.telemetry;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
/* loaded from: classes.dex */
public final class Label implements Object {

    /* renamed from: b */
    public static final C14647a f32558b;

    /* renamed from: a */
    public final long f32559a;

    /* renamed from: c */
    public final int f32560c;

    /* renamed from: d */
    public final long f32561d;

    /* renamed from: f */
    public final String f32562f;

    /* renamed from: i */
    public final String f32563i;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14647a $r0 = new C14647a(null);
        f32558b = $r0;
    }

    public Label(String str, int i, long j, long j2, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "reason");
        this.f32562f = str;
        this.f32560c = i;
        this.f32561d = j;
        this.f32559a = j2;
        this.f32563i = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ long get(Label label, long $l0, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $l0 = System.currentTimeMillis();
        }
        return label.value($l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m907a() {
        String r1 = this.f32562f;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final long m906b() {
        long l0 = this.f32561d;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final String m905c() {
        String r1 = this.f32563i;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32562f;
        $r1.put("sessionId", $r2);
        int $i0 = this.f32560c;
        $r1.put("recordIndex", $i0);
        long $l1 = this.f32561d;
        $r1.put("start_timestamp", $l1);
        long $l12 = this.f32559a;
        $r1.put("last_run_end_session", $l12);
        String $r22 = this.f32563i;
        $r1.put("reason", $r22);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getCount() {
        int i0 = this.f32560c;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getFirst() {
        long l0 = this.f32559a;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long value(long j) {
        long $l0 = this.f32559a;
        long $l1 = j - $l0;
        return Math.abs($l1);
    }
}
