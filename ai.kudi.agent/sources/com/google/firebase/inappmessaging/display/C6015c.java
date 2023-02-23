package com.google.firebase.inappmessaging.display;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.inappmessaging.C6408r;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.InterfaceC6411u;
import com.google.firebase.inappmessaging.display.internal.C6036a;
import com.google.firebase.inappmessaging.display.internal.C6038c;
import com.google.firebase.inappmessaging.display.internal.C6044e;
import com.google.firebase.inappmessaging.display.internal.C6048g;
import com.google.firebase.inappmessaging.display.internal.C6053i;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.C6065m;
import com.google.firebase.inappmessaging.display.internal.C6066n;
import com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6110g;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6371c;
import com.google.firebase.inappmessaging.model.C6378f;
import com.google.firebase.inappmessaging.model.C6381g;
import com.google.firebase.inappmessaging.model.C6383h;
import com.google.firebase.inappmessaging.model.C6387j;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p201g.p215c.p216b.C7513a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: FirebaseInAppMessagingDisplay.java */
/* renamed from: com.google.firebase.inappmessaging.display.c */
/* loaded from: classes2.dex */
public class C6015c extends C6053i {

    /* renamed from: A */
    private final C6038c f14692A;

    /* renamed from: B */
    private FiamListener f14693B;

    /* renamed from: C */
    private AbstractC6386i f14694C;

    /* renamed from: D */
    private InterfaceC6411u f14695D;

    /* renamed from: E */
    String f14696E;

    /* renamed from: c */
    private final C6408r f14697c;

    /* renamed from: d */
    private final Map<String, InterfaceC11700a<C6057l>> f14698d;

    /* renamed from: e */
    private final C6044e f14699e;

    /* renamed from: f */
    private final C6066n f14700f;

    /* renamed from: w */
    private final C6066n f14701w;

    /* renamed from: x */
    private final C6048g f14702x;

    /* renamed from: y */
    private final C6036a f14703y;

    /* renamed from: z */
    private final Application f14704z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInAppMessagingDisplay.java */
    /* renamed from: com.google.firebase.inappmessaging.display.c$a */
    /* loaded from: classes2.dex */
    public class RunnableC6016a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Activity f14705c;

        /* renamed from: d */
        final /* synthetic */ AbstractC6079c f14706d;

        RunnableC6016a(Activity activity, AbstractC6079c abstractC6079c) {
            this.f14705c = activity;
            this.f14706d = abstractC6079c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6015c.this.m22962v(this.f14705c, this.f14706d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInAppMessagingDisplay.java */
    /* renamed from: com.google.firebase.inappmessaging.display.c$b */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC6017b implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Activity f14708c;

        View$OnClickListenerC6017b(Activity activity) {
            this.f14708c = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C6015c.this.f14695D != null) {
                C6015c.this.f14695D.mo22088c(InterfaceC6411u.EnumC6412a.CLICK);
            }
            C6015c.this.m22966r(this.f14708c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInAppMessagingDisplay.java */
    /* renamed from: com.google.firebase.inappmessaging.display.c$c */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC6018c implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6365a f14710c;

        /* renamed from: d */
        final /* synthetic */ Activity f14711d;

        View$OnClickListenerC6018c(C6365a c6365a, Activity activity) {
            this.f14710c = c6365a;
            this.f14711d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C6015c.this.f14695D != null) {
                C6065m.m22816f("Calling callback for click action");
                C6015c.this.f14695D.mo22090a(this.f14710c);
            }
            C6015c.this.m22958z(this.f14711d, Uri.parse(this.f14710c.m22202b()));
            C6015c.this.m22990B();
            C6015c.this.m22987E(this.f14711d);
            C6015c.this.f14694C = null;
            C6015c.this.f14695D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInAppMessagingDisplay.java */
    /* renamed from: com.google.firebase.inappmessaging.display.c$d */
    /* loaded from: classes2.dex */
    public class C6019d extends C6044e.AbstractC6045a {

        /* renamed from: w */
        final /* synthetic */ AbstractC6079c f14713w;

        /* renamed from: x */
        final /* synthetic */ Activity f14714x;

        /* renamed from: y */
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f14715y;

        /* compiled from: FirebaseInAppMessagingDisplay.java */
        /* renamed from: com.google.firebase.inappmessaging.display.c$d$a */
        /* loaded from: classes2.dex */
        class View$OnTouchListenerC6020a implements View.OnTouchListener {
            View$OnTouchListenerC6020a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    if (C6015c.this.f14695D != null) {
                        C6015c.this.f14695D.mo22088c(InterfaceC6411u.EnumC6412a.UNKNOWN_DISMISS_TYPE);
                    }
                    C6019d c6019d = C6019d.this;
                    C6015c.this.m22966r(c6019d.f14714x);
                    return true;
                }
                return false;
            }
        }

        /* compiled from: FirebaseInAppMessagingDisplay.java */
        /* renamed from: com.google.firebase.inappmessaging.display.c$d$b */
        /* loaded from: classes2.dex */
        class C6021b implements C6066n.InterfaceC6068b {
            C6021b() {
            }

            @Override // com.google.firebase.inappmessaging.display.internal.C6066n.InterfaceC6068b
            /* renamed from: a */
            public void mo22813a() {
                if (C6015c.this.f14694C == null || C6015c.this.f14695D == null) {
                    return;
                }
                C6065m.m22816f("Impression timer onFinish for: " + C6015c.this.f14694C.m22152a().m22180a());
                C6015c.this.f14695D.mo22087d();
            }
        }

        /* compiled from: FirebaseInAppMessagingDisplay.java */
        /* renamed from: com.google.firebase.inappmessaging.display.c$d$c */
        /* loaded from: classes2.dex */
        class C6022c implements C6066n.InterfaceC6068b {
            C6022c() {
            }

            @Override // com.google.firebase.inappmessaging.display.internal.C6066n.InterfaceC6068b
            /* renamed from: a */
            public void mo22813a() {
                if (C6015c.this.f14694C != null && C6015c.this.f14695D != null) {
                    C6015c.this.f14695D.mo22088c(InterfaceC6411u.EnumC6412a.AUTO);
                }
                C6019d c6019d = C6019d.this;
                C6015c.this.m22966r(c6019d.f14714x);
            }
        }

        /* compiled from: FirebaseInAppMessagingDisplay.java */
        /* renamed from: com.google.firebase.inappmessaging.display.c$d$d */
        /* loaded from: classes2.dex */
        class RunnableC6023d implements Runnable {
            RunnableC6023d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6048g c6048g = C6015c.this.f14702x;
                C6019d c6019d = C6019d.this;
                c6048g.m22902i(c6019d.f14713w, c6019d.f14714x);
                if (C6019d.this.f14713w.mo22770b().m22877n().booleanValue()) {
                    C6015c.this.f14692A.m22933a(C6015c.this.f14704z, C6019d.this.f14713w.mo22767f(), C6038c.EnumC6041c.TOP);
                }
            }
        }

        C6019d(AbstractC6079c abstractC6079c, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f14713w = abstractC6079c;
            this.f14714x = activity;
            this.f14715y = onGlobalLayoutListener;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.C6044e.AbstractC6045a
        /* renamed from: e */
        public void mo22922e(Exception exc) {
            C6065m.m22817e("Image download failure ");
            if (this.f14715y != null) {
                this.f14713w.mo22768e().getViewTreeObserver().removeGlobalOnLayoutListener(this.f14715y);
            }
            C6015c.this.m22967q();
            C6015c.this.f14694C = null;
            C6015c.this.f14695D = null;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.C6044e.AbstractC6045a
        /* renamed from: g */
        public void mo22920g() {
            if (!this.f14713w.mo22770b().m22875p().booleanValue()) {
                this.f14713w.mo22767f().setOnTouchListener(new View$OnTouchListenerC6020a());
            }
            C6015c.this.f14700f.m22814b(new C6021b(), 5000L, 1000L);
            if (this.f14713w.mo22770b().m22876o().booleanValue()) {
                C6015c.this.f14701w.m22814b(new C6022c(), 20000L, 1000L);
            }
            this.f14714x.runOnUiThread(new RunnableC6023d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInAppMessagingDisplay.java */
    /* renamed from: com.google.firebase.inappmessaging.display.c$e */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6024e {

        /* renamed from: a */
        static final /* synthetic */ int[] f14721a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f14721a = iArr;
            try {
                iArr[MessageType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14721a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14721a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14721a[MessageType.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6015c(C6408r c6408r, Map<String, InterfaceC11700a<C6057l>> map, C6044e c6044e, C6066n c6066n, C6066n c6066n2, C6048g c6048g, Application application, C6036a c6036a, C6038c c6038c) {
        this.f14697c = c6408r;
        this.f14698d = map;
        this.f14699e = c6044e;
        this.f14700f = c6066n;
        this.f14701w = c6066n2;
        this.f14702x = c6048g;
        this.f14704z = application;
        this.f14703y = c6036a;
        this.f14692A = c6038c;
    }

    /* renamed from: A */
    private void m22991A(Activity activity, AbstractC6079c abstractC6079c, C6381g c6381g, C6044e.AbstractC6045a abstractC6045a) {
        if (m22961w(c6381g)) {
            C6044e.C6046b m22924c = this.f14699e.m22924c(c6381g.m22160b());
            m22924c.m22914d(activity.getClass());
            m22924c.m22915c(C6026e.image_placeholder);
            m22924c.m22916b(abstractC6079c.mo22768e(), abstractC6045a);
            return;
        }
        abstractC6045a.mo22920g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m22990B() {
        FiamListener fiamListener = this.f14693B;
        if (fiamListener != null) {
            fiamListener.onFiamClick();
        }
    }

    /* renamed from: C */
    private void m22989C() {
        FiamListener fiamListener = this.f14693B;
        if (fiamListener != null) {
            fiamListener.onFiamDismiss();
        }
    }

    /* renamed from: D */
    private void m22988D() {
        FiamListener fiamListener = this.f14693B;
        if (fiamListener != null) {
            fiamListener.onFiamTrigger();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m22987E(Activity activity) {
        if (this.f14702x.m22903h()) {
            this.f14702x.m22910a(activity);
            m22967q();
        }
    }

    /* renamed from: F */
    private void m22986F(Activity activity) {
        AbstractC6079c m22940a;
        if (this.f14694C != null && !this.f14697c.m22099a()) {
            if (this.f14694C.m22151c().equals(MessageType.UNSUPPORTED)) {
                C6065m.m22817e("The message being triggered is not supported by this version of the sdk.");
                return;
            }
            m22988D();
            C6057l c6057l = this.f14698d.get(C6110g.m22719a(this.f14694C.m22151c(), m22963u(this.f14704z))).get();
            int i = C6024e.f14721a[this.f14694C.m22151c().ordinal()];
            if (i == 1) {
                m22940a = this.f14703y.m22940a(c6057l, this.f14694C);
            } else if (i == 2) {
                m22940a = this.f14703y.m22937d(c6057l, this.f14694C);
            } else if (i == 3) {
                m22940a = this.f14703y.m22938c(c6057l, this.f14694C);
            } else if (i != 4) {
                C6065m.m22817e("No bindings found for this message type");
                return;
            } else {
                m22940a = this.f14703y.m22939b(c6057l, this.f14694C);
            }
            activity.findViewById(16908290).post(new RunnableC6016a(activity, m22940a));
            return;
        }
        C6065m.m22817e("No active message found to render");
    }

    /* renamed from: G */
    private boolean m22985G(Activity activity) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(intent, 0);
        return (queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true;
    }

    /* renamed from: H */
    private void m22984H(Activity activity) {
        String str = this.f14696E;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            return;
        }
        C6065m.m22816f("Unbinding from activity: " + activity.getLocalClassName());
        this.f14697c.m22098b();
        this.f14699e.m22925b(activity.getClass());
        m22987E(activity);
        this.f14696E = null;
    }

    /* renamed from: p */
    private void m22968p(final Activity activity) {
        String str = this.f14696E;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            C6065m.m22816f("Binding to activity: " + activity.getLocalClassName());
            this.f14697c.m22094f(new FirebaseInAppMessagingDisplay() { // from class: com.google.firebase.inappmessaging.display.a
                @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
                public final void displayMessage(AbstractC6386i abstractC6386i, InterfaceC6411u interfaceC6411u) {
                    C6015c.this.m22959y(activity, abstractC6386i, interfaceC6411u);
                }
            });
            this.f14696E = activity.getLocalClassName();
        }
        if (this.f14694C != null) {
            m22986F(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m22967q() {
        this.f14700f.m22815a();
        this.f14701w.m22815a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m22966r(Activity activity) {
        C6065m.m22821a("Dismissing fiam");
        m22989C();
        m22987E(activity);
        this.f14694C = null;
        this.f14695D = null;
    }

    /* renamed from: s */
    private List<C6365a> m22965s(AbstractC6386i abstractC6386i) {
        ArrayList arrayList = new ArrayList();
        int i = C6024e.f14721a[abstractC6386i.m22151c().ordinal()];
        if (i == 1) {
            arrayList.add(((C6371c) abstractC6386i).m22196e());
        } else if (i == 2) {
            arrayList.add(((C6387j) abstractC6386i).m22148e());
        } else if (i == 3) {
            arrayList.add(((C6383h) abstractC6386i).m22156e());
        } else if (i != 4) {
            arrayList.add(C6365a.m22203a().m22200a());
        } else {
            C6378f c6378f = (C6378f) abstractC6386i;
            arrayList.add(c6378f.m22172i());
            arrayList.add(c6378f.m22171j());
        }
        return arrayList;
    }

    /* renamed from: t */
    private C6381g m22964t(AbstractC6386i abstractC6386i) {
        if (abstractC6386i.m22151c() == MessageType.CARD) {
            C6378f c6378f = (C6378f) abstractC6386i;
            C6381g m22173h = c6378f.m22173h();
            C6381g m22174g = c6378f.m22174g();
            return m22963u(this.f14704z) == 1 ? m22961w(m22173h) ? m22173h : m22174g : m22961w(m22174g) ? m22174g : m22173h;
        }
        return abstractC6386i.mo22150b();
    }

    /* renamed from: u */
    private static int m22963u(Application application) {
        return application.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m22962v(Activity activity, AbstractC6079c abstractC6079c) {
        View.OnClickListener onClickListener;
        View$OnClickListenerC6017b view$OnClickListenerC6017b = new View$OnClickListenerC6017b(activity);
        HashMap hashMap = new HashMap();
        for (C6365a c6365a : m22965s(this.f14694C)) {
            if (c6365a != null && !TextUtils.isEmpty(c6365a.m22202b())) {
                onClickListener = new View$OnClickListenerC6018c(c6365a, activity);
            } else {
                C6065m.m22816f("No action url found for action. Treating as dismiss.");
                onClickListener = view$OnClickListenerC6017b;
            }
            hashMap.put(c6365a, onClickListener);
        }
        ViewTreeObserver.OnGlobalLayoutListener mo22766g = abstractC6079c.mo22766g(hashMap, view$OnClickListenerC6017b);
        if (mo22766g != null) {
            abstractC6079c.mo22768e().getViewTreeObserver().addOnGlobalLayoutListener(mo22766g);
        }
        m22991A(activity, abstractC6079c, m22964t(this.f14694C), new C6019d(abstractC6079c, activity, mo22766g));
    }

    /* renamed from: w */
    private boolean m22961w(C6381g c6381g) {
        return (c6381g == null || TextUtils.isEmpty(c6381g.m22160b())) ? false : true;
    }

    /* renamed from: x */
    private boolean m22960x(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m22958z(Activity activity, Uri uri) {
        if (m22960x(uri) && m22985G(activity)) {
            C7513a m18525a = new C7513a.C7514a().m18525a();
            Intent intent = m18525a.f17852a;
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            m18525a.m18526a(activity, uri);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", uri);
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent2, 0);
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        if (resolveActivity != null) {
            activity.startActivity(intent2);
        } else {
            C6065m.m22817e("Device cannot resolve intent for: android.intent.action.VIEW");
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.C6053i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m22984H(activity);
        this.f14697c.m22095e();
        super.onActivityPaused(activity);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.C6053i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        m22968p(activity);
    }

    /* renamed from: y */
    public /* synthetic */ void m22959y(Activity activity, AbstractC6386i abstractC6386i, InterfaceC6411u interfaceC6411u) {
        if (this.f14694C == null && !this.f14697c.m22099a()) {
            this.f14694C = abstractC6386i;
            this.f14695D = interfaceC6411u;
            m22986F(activity);
            return;
        }
        C6065m.m22821a("Active FIAM exists. Skipping trigger");
    }
}
