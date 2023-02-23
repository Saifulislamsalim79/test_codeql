package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.x */
/* loaded from: classes.dex */
public abstract class AbstractC4413x extends Type {

    /* renamed from: b */
    private boolean f10782b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC4413x(ClassWriter classWriter) {
        super(classWriter);
        ClassWriter $r1 = super.f9987b;
        $r1.toByteArray();
    }

    /* renamed from: a */
    protected void mo27843a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getCount() {
        boolean $z0 = this.f10782b;
        return $z0;
    }

    /* renamed from: n */
    protected abstract boolean mo27842n();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void next() {
        boolean $z0 = getCount();
        if ($z0) {
            return;
        }
        IllegalStateException $r1 = new IllegalStateException("Not initialized");
        throw $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void put() {
        boolean $z0 = this.f10782b;
        if ($z0) {
            IllegalStateException $r2 = new IllegalStateException("Can't initialize twice");
            throw $r2;
        }
        boolean $z02 = mo27842n();
        if ($z02) {
            return;
        }
        ClassWriter $r1 = super.f9987b;
        $r1.append();
        this.f10782b = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void visitFrame() {
        boolean $z0 = this.f10782b;
        if ($z0) {
            IllegalStateException $r2 = new IllegalStateException("Can't initialize twice");
            throw $r2;
        }
        mo27843a();
        ClassWriter $r1 = super.f9987b;
        $r1.append();
        this.f10782b = true;
    }
}
