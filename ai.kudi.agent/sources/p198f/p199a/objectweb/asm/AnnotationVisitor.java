package p198f.p199a.objectweb.asm;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import f.a.a.a.g.a;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p198f.p199a.objectweb.asm.signature.InterfaceC7447b;
import p198f.p199a.objectweb.asm.util.C7451b;
/* compiled from: Refresh.kt */
/* renamed from: f.a.objectweb.asm.AnnotationVisitor */
/* loaded from: classes.dex */
public final class AnnotationVisitor {
    private final Application app;

    /* renamed from: av */
    private p198f.p199a.objectweb.asm.util.AnnotationVisitor f17655av;
    private p198f.p199a.objectweb.asm.util.AnnotationVisitor av1;

    /* renamed from: c */
    private final InterfaceC7447b f17656c;
    private InterfaceC11767l<? super a, C13666w> length;
    private InterfaceC11767l<? super Throwable, C13666w> text;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AnnotationVisitor(Application application, InterfaceC7447b interfaceC7447b) {
        Log_OC.getArray(application, "application");
        Log_OC.getArray(interfaceC7447b, "checker");
        this.app = application;
        this.f17656c = interfaceC7447b;
        C7451b $r3 = new C7451b(application);
        this.f17655av = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void visitArray() {
        p198f.p199a.objectweb.asm.util.AnnotationVisitor $r1 = this.f17655av;
        if ($r1 == null) {
            return;
        }
        $r1.onOptionsItemSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void visitEnum() {
        p198f.p199a.objectweb.asm.util.AnnotationVisitor $r1 = this.av1;
        if ($r1 == null) {
            return;
        }
        $r1.onOptionsItemSelected();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AnnotationVisitor m18706a(Label label) {
        Log_OC.getArray(label, "versionInfo");
        InterfaceC7447b $r3 = this.f17656c;
        AnnotationWriter $r2 = new AnnotationWriter(this);
        $r3.mo18698a(label, $r2);
        return this;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AnnotationVisitor onCreate() {
        C7446h $r1 = Label.f17658b;
        Application $r2 = this.app;
        PackageManager $r3 = $r2.getPackageManager();
        Application $r22 = this.app;
        String $r4 = $r22.getPackageName();
        PackageInfo $r5 = $r3.getPackageInfo($r4, 0);
        Log_OC.loadImage($r5, "application.packageManager\n                .getPackageInfo(application.packageName, 0)");
        Label $r6 = $r1.show($r5);
        m18706a($r6);
        return this;
    }

    public final AnnotationVisitor remove(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "callback");
        this.length = interfaceC11767l;
        return this;
    }

    public final AnnotationVisitor show(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "callback");
        this.text = interfaceC11767l;
        return this;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l visitAnnotation() {
        InterfaceC11767l r1 = this.length;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l visitEnd() {
        InterfaceC11767l r1 = this.text;
        return r1;
    }
}
