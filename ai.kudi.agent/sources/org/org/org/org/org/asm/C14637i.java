package org.org.org.org.org.asm;

import org.org.org.org.org.C14705f;
import org.org.org.org.org.asm.commons.JSONObject;
/* renamed from: org.org.org.org.org.asm.i */
/* loaded from: classes.dex */
public final class C14637i implements InterfaceC14636g {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m956a() {
        Long $r1 = m952f();
        if ($r1 != null) {
            long $l0 = $r1.longValue();
            Long $r12 = getTitle();
            long $l1 = $r12 != null ? $r12.longValue() : 0L;
            long $l2 = System.currentTimeMillis();
            close($l1 + ($l2 - $l0));
            m954b();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m955a(long j) {
        C14705f $r1 = C14705f.f32765a;
        $r1.add(j, "APPLICATION_START_TIMESTAMP");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(long j) {
        C14705f $r1 = C14705f.f32765a;
        $r1.add(j, "LAST_APPLICATION_SETTLE_TIMESTAMP");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final void m954b() {
        C14705f $r1 = C14705f.f32765a;
        $r1.remove("LAST_APPLICATION_SETTLE_TIMESTAMP");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: c */
    public JSONObject mo814c() {
        long $l0 = System.currentTimeMillis();
        m955a($l0);
        m954b();
        m953d();
        C14630a $r1 = new C14630a(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        long $l0 = System.currentTimeMillis();
        add($l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close(long j) {
        C14705f $r1 = C14705f.f32765a;
        $r1.add(j, "APPLICATION_DURATION_IN_BACKGROUND");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m953d() {
        C14705f $r1 = C14705f.f32765a;
        $r1.remove("LAST_APPLICATION_SETTLE_TIMESTAMP");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: e */
    public String mo812e() {
        String $r1 = e.a.a.a.c.i.a.class.getCanonicalName();
        return $r1 != null ? $r1 : "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final Long m952f() {
        C14705f $r2 = C14705f.f32765a;
        Long $r1 = $r2.getValue("LAST_APPLICATION_SETTLE_TIMESTAMP");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Permissions getIcon() {
        Long $r1 = getTitle();
        long $l0 = $r1 != null ? $r1.longValue() : 0L;
        Long $r12 = m952f();
        if ($r12 != null) {
            long $l1 = $r12.longValue();
            long $l2 = System.currentTimeMillis();
            $l0 += $l2 - $l1;
        }
        long $l12 = System.currentTimeMillis();
        Long $r13 = size();
        if ($r13 != null) {
            long $l22 = $r13.longValue();
            long $l13 = $l12 - $l22;
            Permissions $r2 = new Permissions($l13, $l13 - $l0);
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Long getTitle() {
        C14705f $r2 = C14705f.f32765a;
        Long $r1 = $r2.getValue("LAST_APPLICATION_SETTLE_TIMESTAMP");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Long size() {
        C14705f $r2 = C14705f.f32765a;
        Long $r1 = $r2.getValue("APPLICATION_START_TIMESTAMP");
        return $r1;
    }
}
