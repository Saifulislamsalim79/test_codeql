package org.org.org.org.asm.http;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.C14598f;
/* renamed from: org.org.org.org.asm.http.b */
/* loaded from: classes.dex */
public final class C14602b extends AbstractC11802m implements InterfaceC11756a<Locale> {

    /* renamed from: a */
    public static final C14602b f32356a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14602b $r0 = new C14602b();
        f32356a = $r0;
    }

    public C14602b() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Locale invoke() {
        Locale $r1 = onCreateView();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Locale onCreateView() {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 24) {
            C14598f $r1 = C14598f.f32351c;
            Context $r2 = $r1.getContext();
            Resources $r3 = $r2.getResources();
            Log_OC.loadImage($r3, "ContextExtractorUtil.appContext().resources");
            Locale $r6 = $r3.getConfiguration().locale;
            return $r6;
        }
        C14598f $r12 = C14598f.f32351c;
        Context $r22 = $r12.getContext();
        Resources $r32 = $r22.getResources();
        Log_OC.loadImage($r32, "ContextExtractorUtil.appContext().resources");
        Configuration $r4 = $r32.getConfiguration();
        Log_OC.loadImage($r4, "ContextExtractorUtil.app…).resources.configuration");
        LocaleList $r5 = $r4.getLocales();
        Locale $r62 = $r5.get(0);
        return $r62;
    }
}
