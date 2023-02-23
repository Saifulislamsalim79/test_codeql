package org.org.org.org.asm.http;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.C14598f;
import org.org.org.org.org.C14705f;
import org.org.org.org.org.common.C14642f;
import org.org.org.org.org.common.telemetry.C14648h;
import org.org.org.org.org.initializer.C14708f;
/* renamed from: org.org.org.org.asm.http.f */
/* loaded from: classes.dex */
public final class C14603f implements InterfaceC14604i {

    /* renamed from: a */
    public static final InterfaceC11824h f32357a;

    /* renamed from: b */
    public static final InterfaceC11824h f32358b;

    /* renamed from: c */
    public static final C14603f f32359c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        InterfaceC11824h $r2;
        InterfaceC11824h $r22;
        C14603f $r0 = new C14603f();
        f32359c = $r0;
        StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 $r1 = StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2.INSTANCE;
        $r2 = C13218k.m5625b($r1);
        f32357a = $r2;
        C14602b $r3 = C14602b.f32356a;
        $r22 = C13218k.m5625b($r3);
        f32358b = $r22;
    }

    private C14603f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final PackageInfo m1099d() {
        InterfaceC11824h $r2 = f32357a;
        Object $r1 = $r2.getValue();
        PackageInfo $r3 = (PackageInfo) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    private final Locale m1098f() {
        InterfaceC11824h $r2 = f32358b;
        Object $r1 = $r2.getValue();
        Locale $r3 = (Locale) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    /* renamed from: a */
    public String mo1097a() {
        C14708f $r1 = C14708f.f32807a;
        C14642f $r2 = $r1.add();
        C14648h $r3 = C14642f.m932a($r2, null, 1, null);
        String $r4 = $r3.m897c();
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String add() {
        C14705f $r2 = C14705f.f32765a;
        String $r1 = $r2.m691a();
        return $r1 != null ? $r1 : "-";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    /* renamed from: b */
    public String mo1096b() {
        C14705f $r2 = C14705f.f32765a;
        String $r1 = $r2.m688c();
        return $r1 != null ? $r1 : "-";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String close() {
        C14598f $r1 = C14598f.f32351c;
        Context $r2 = $r1.getContext();
        String $r3 = $r2.getPackageName();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String decode() {
        StringBuilder $r2 = new StringBuilder();
        String $r1 = Build.MANUFACTURER;
        $r2.append($r1);
        $r2.append(' ');
        String $r12 = Build.MODEL;
        $r2.append($r12);
        String $r13 = $r2.toString();
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    /* renamed from: e */
    public String mo1095e() {
        C14705f $r2 = C14705f.f32765a;
        String $r1 = $r2.m686e();
        return $r1 != null ? $r1 : "-";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String get() {
        String $r1 = System.getProperty("http.agent");
        return $r1 != null ? $r1 : "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getIcon() {
        PackageInfo $r1 = m1099d();
        if ($r1 != null) {
            int $i0 = $r1.versionCode;
            String $r2 = String.valueOf($i0);
            return $r2 != null ? $r2 : "";
        }
        return "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getItem() {
        String r1 = Build.FINGERPRINT;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getLanguageCode() {
        Locale $r1 = m1098f();
        String $r2 = $r1.getLanguage();
        return $r2;
    }

    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getOrder() {
        return "nativeapp";
    }

    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getResources() {
        return "com.smartlook.sdk.smartlook";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getString() {
        String r1 = Build.VERSION.RELEASE;
        return r1;
    }

    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getText() {
        return "1.8.7-native";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getTitle() {
        TimeZone $r1 = TimeZone.getDefault();
        Log_OC.loadImage($r1, "TimeZone.getDefault()");
        String $r2 = $r1.getID();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String getVersion() {
        String $r2;
        PackageInfo $r1 = m1099d();
        return ($r1 == null || ($r2 = $r1.versionName) == null) ? "" : $r2;
    }

    @Override // org.org.org.org.asm.http.InterfaceC14604i
    /* renamed from: h */
    public String mo1094h() {
        return "release";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.http.InterfaceC14604i
    public String update() {
        StringBuilder $r1 = new StringBuilder();
        Field[] $r3 = Build.VERSION_CODES.class.getFields();
        int $i0 = Build.VERSION.SDK_INT;
        Field $r4 = $r3[$i0];
        Log_OC.loadImage($r4, "Build.VERSION_CODES::cla…ds[Build.VERSION.SDK_INT]");
        String $r5 = $r4.getName();
        $r1.append($r5);
        $r1.append(" ");
        $r1.append($i0);
        String $r52 = $r1.toString();
        return $r52;
    }
}
