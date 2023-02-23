package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: functions.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.d */
/* loaded from: classes3.dex */
public final class C13643d {

    /* renamed from: a */
    private static final InterfaceC11767l<Object, Boolean> f30070a;

    /* renamed from: b */
    private static final InterfaceC11772q<Object, Object, Object, C13666w> f30071b;

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$a */
    /* loaded from: classes3.dex */
    static final class C13644a extends AbstractC11802m implements InterfaceC11767l {

        /* renamed from: c */
        public static final C13644a f30072c = new C13644a();

        C13644a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$b */
    /* loaded from: classes3.dex */
    static final class C13645b extends AbstractC11802m implements InterfaceC11767l<Object, Boolean> {

        /* renamed from: c */
        public static final C13645b f30073c = new C13645b();

        C13645b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m4263a(Object obj) {
            return true;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            m4263a(obj);
            return Boolean.TRUE;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$c */
    /* loaded from: classes3.dex */
    static final class C13646c extends AbstractC11802m implements InterfaceC11767l<Object, C13666w> {

        /* renamed from: c */
        public static final C13646c f30074c = new C13646c();

        C13646c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Object obj) {
            invoke2(obj);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$d */
    /* loaded from: classes3.dex */
    static final class C13647d extends AbstractC11802m implements InterfaceC11771p<Object, Object, C13666w> {

        /* renamed from: c */
        public static final C13647d f30075c = new C13647d();

        C13647d() {
            super(2);
        }

        /* renamed from: a */
        public final void m4262a(Object obj, Object obj2) {
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(Object obj, Object obj2) {
            m4262a(obj, obj2);
            return C13666w.f30112a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$e */
    /* loaded from: classes3.dex */
    static final class C13648e extends AbstractC11802m implements InterfaceC11772q<Object, Object, Object, C13666w> {

        /* renamed from: c */
        public static final C13648e f30076c = new C13648e();

        C13648e() {
            super(3);
        }

        /* renamed from: a */
        public final void m4261a(Object obj, Object obj2, Object obj3) {
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        public /* bridge */ /* synthetic */ C13666w invoke(Object obj, Object obj2, Object obj3) {
            m4261a(obj, obj2, obj3);
            return C13666w.f30112a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$f */
    /* loaded from: classes3.dex */
    static final class C13649f extends AbstractC11802m implements InterfaceC11767l<Object, Object> {

        /* renamed from: c */
        public static final C13649f f30077c = new C13649f();

        C13649f() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    static {
        C13649f c13649f = C13649f.f30077c;
        f30070a = C13645b.f30073c;
        C13644a c13644a = C13644a.f30072c;
        C13646c c13646c = C13646c.f30074c;
        C13647d c13647d = C13647d.f30075c;
        f30071b = C13648e.f30076c;
    }

    /* renamed from: a */
    public static final <T> InterfaceC11767l<T, Boolean> m4266a() {
        return (InterfaceC11767l<T, Boolean>) f30070a;
    }

    /* renamed from: b */
    public static final InterfaceC11772q<Object, Object, Object, C13666w> m4265b() {
        return f30071b;
    }
}
