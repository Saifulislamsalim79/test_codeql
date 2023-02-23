package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public abstract class Label extends MethodWriter {

    /* renamed from: b */
    private boolean f9986b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label(ClassWriter classWriter) {
        super(classWriter);
        ClassWriter $r1 = super.f9987b;
        $r1.toByteArray();
    }

    /* renamed from: a */
    protected void mo28323a() {
    }

    protected abstract boolean copy();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void copyTo() {
        boolean $z0 = equals();
        if ($z0) {
            return;
        }
        IllegalStateException $r1 = new IllegalStateException("Not initialized");
        throw $r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean equals() {
        boolean $z0 = this.f9986b;
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void put() {
        boolean $z0 = this.f9986b;
        if ($z0) {
            IllegalStateException $r2 = new IllegalStateException("Can't initialize twice");
            throw $r2;
        }
        boolean $z02 = copy();
        if ($z02) {
            return;
        }
        ClassWriter $r1 = super.f9987b;
        $r1.append();
        this.f9986b = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void visitMaxs() {
        boolean $z0 = this.f9986b;
        if ($z0) {
            IllegalStateException $r2 = new IllegalStateException("Can't initialize twice");
            throw $r2;
        }
        mo28323a();
        ClassWriter $r1 = super.f9987b;
        $r1.append();
        this.f9986b = true;
    }
}
