package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.model.MessageType;
/* compiled from: InflaterConfigModule.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.g */
/* loaded from: classes2.dex */
public class C6110g {

    /* renamed from: b */
    public static int f14939b = 327938;

    /* renamed from: c */
    public static int f14940c = 327970;

    /* renamed from: a */
    private int f14941a = 65824;

    /* compiled from: InflaterConfigModule.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.g$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6111a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14942a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f14942a = iArr;
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14942a[MessageType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14942a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14942a[MessageType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static String m22719a(MessageType messageType, int i) {
        if (i == 1) {
            int i2 = C6111a.f14942a[messageType.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return null;
                        }
                        return "BANNER_PORTRAIT";
                    }
                    return "IMAGE_ONLY_PORTRAIT";
                }
                return "CARD_PORTRAIT";
            }
            return "MODAL_PORTRAIT";
        }
        int i3 = C6111a.f14942a[messageType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return null;
                    }
                    return "BANNER_LANDSCAPE";
                }
                return "IMAGE_ONLY_LANDSCAPE";
            }
            return "CARD_LANDSCAPE";
        }
        return "MODAL_LANDSCAPE";
    }

    /* renamed from: b */
    public C6057l m22718b(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        Float valueOf = Float.valueOf(0.3f);
        m22874q.m22856i(valueOf);
        m22874q.m22855j(valueOf);
        m22874q.m22858g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f)));
        m22874q.m22857h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        m22874q.m22854k(48);
        m22874q.m22853l(Integer.valueOf(this.f14941a));
        m22874q.m22851n(-1);
        m22874q.m22852m(-2);
        m22874q.m22861d(Boolean.TRUE);
        m22874q.m22863b(Boolean.TRUE);
        m22874q.m22862c(Boolean.TRUE);
        return m22874q.m22864a();
    }

    /* renamed from: c */
    public C6057l m22717c(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        Float valueOf = Float.valueOf(0.3f);
        m22874q.m22856i(valueOf);
        m22874q.m22855j(valueOf);
        m22874q.m22858g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f)));
        m22874q.m22857h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        m22874q.m22854k(48);
        m22874q.m22853l(Integer.valueOf(this.f14941a));
        m22874q.m22851n(-1);
        m22874q.m22852m(-2);
        m22874q.m22861d(Boolean.TRUE);
        m22874q.m22863b(Boolean.TRUE);
        m22874q.m22862c(Boolean.TRUE);
        return m22874q.m22864a();
    }

    /* renamed from: d */
    public C6057l m22716d(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        m22874q.m22858g(Integer.valueOf((int) (d * 0.8d)));
        m22874q.m22857h(Integer.valueOf(displayMetrics.widthPixels));
        m22874q.m22856i(Float.valueOf(1.0f));
        m22874q.m22855j(Float.valueOf(0.5f));
        m22874q.m22854k(17);
        m22874q.m22853l(Integer.valueOf(f14940c));
        m22874q.m22851n(-2);
        m22874q.m22852m(-2);
        m22874q.m22861d(Boolean.FALSE);
        m22874q.m22863b(Boolean.FALSE);
        m22874q.m22862c(Boolean.FALSE);
        return m22874q.m22864a();
    }

    /* renamed from: e */
    public C6057l m22715e(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        m22874q.m22858g(Integer.valueOf((int) (d * 0.8d)));
        m22874q.m22857h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f)));
        m22874q.m22856i(Float.valueOf(0.6f));
        m22874q.m22855j(Float.valueOf(1.0f));
        m22874q.m22860e(Float.valueOf(0.1f));
        m22874q.m22859f(Float.valueOf(0.9f));
        m22874q.m22854k(17);
        m22874q.m22853l(Integer.valueOf(f14940c));
        m22874q.m22851n(-2);
        m22874q.m22852m(-2);
        m22874q.m22861d(Boolean.FALSE);
        m22874q.m22863b(Boolean.FALSE);
        m22874q.m22862c(Boolean.FALSE);
        return m22874q.m22864a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public DisplayMetrics m22714f(Application application) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: g */
    public C6057l m22713g(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        m22874q.m22858g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f)));
        m22874q.m22857h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        m22874q.m22855j(valueOf);
        m22874q.m22856i(valueOf);
        m22874q.m22854k(17);
        m22874q.m22853l(Integer.valueOf(f14939b));
        m22874q.m22851n(-2);
        m22874q.m22852m(-2);
        m22874q.m22861d(Boolean.FALSE);
        m22874q.m22863b(Boolean.FALSE);
        m22874q.m22862c(Boolean.FALSE);
        return m22874q.m22864a();
    }

    /* renamed from: h */
    public C6057l m22712h(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        m22874q.m22858g(Integer.valueOf((int) (d * 0.8d)));
        m22874q.m22857h(Integer.valueOf(displayMetrics.widthPixels));
        m22874q.m22856i(Float.valueOf(1.0f));
        Float valueOf = Float.valueOf(0.4f);
        m22874q.m22855j(valueOf);
        m22874q.m22860e(Float.valueOf(0.6f));
        m22874q.m22859f(valueOf);
        m22874q.m22854k(17);
        m22874q.m22853l(Integer.valueOf(f14939b));
        m22874q.m22851n(-1);
        m22874q.m22852m(-1);
        m22874q.m22861d(Boolean.FALSE);
        m22874q.m22863b(Boolean.FALSE);
        m22874q.m22862c(Boolean.FALSE);
        return m22874q.m22864a();
    }

    /* renamed from: i */
    public C6057l m22711i(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        m22874q.m22858g(Integer.valueOf((int) (d * 0.8d)));
        m22874q.m22857h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f)));
        m22874q.m22856i(Float.valueOf(0.6f));
        m22874q.m22860e(Float.valueOf(0.1f));
        Float valueOf = Float.valueOf(0.9f);
        m22874q.m22855j(valueOf);
        m22874q.m22859f(valueOf);
        m22874q.m22854k(17);
        m22874q.m22853l(Integer.valueOf(f14939b));
        m22874q.m22851n(-1);
        m22874q.m22852m(-2);
        m22874q.m22861d(Boolean.FALSE);
        m22874q.m22863b(Boolean.FALSE);
        m22874q.m22862c(Boolean.FALSE);
        return m22874q.m22864a();
    }

    /* renamed from: j */
    public C6057l m22710j(DisplayMetrics displayMetrics) {
        C6057l.C6058a m22874q = C6057l.m22874q();
        m22874q.m22858g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f)));
        m22874q.m22857h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        m22874q.m22855j(valueOf);
        m22874q.m22856i(valueOf);
        m22874q.m22854k(17);
        m22874q.m22853l(Integer.valueOf(f14939b));
        m22874q.m22851n(-2);
        m22874q.m22852m(-2);
        m22874q.m22861d(Boolean.FALSE);
        m22874q.m22863b(Boolean.FALSE);
        m22874q.m22862c(Boolean.FALSE);
        return m22874q.m22864a();
    }
}
