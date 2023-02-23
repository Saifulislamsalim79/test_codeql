package kotlin.p493j0.p494o.p495c.p496o0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11815z;
import kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d;
import kotlin.p557z.C13706j;
/* compiled from: CallerImpl.kt */
/* renamed from: kotlin.j0.o.c.o0.e */
/* loaded from: classes3.dex */
public abstract class AbstractC11992e<M extends Member> implements InterfaceC11990d<M> {

    /* renamed from: e */
    public static final C11996d f26713e = new C11996d(null);

    /* renamed from: a */
    private final List<Type> f26714a;

    /* renamed from: b */
    private final M f26715b;

    /* renamed from: c */
    private final Type f26716c;

    /* renamed from: d */
    private final Class<?> f26717d;

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$a */
    /* loaded from: classes3.dex */
    public static final class C11993a extends AbstractC11992e<Constructor<?>> implements InterfaceC11989c {

        /* renamed from: f */
        private final Object f26718f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C11993a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.e0.d.l.f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.e0.d.l.e(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.e0.d.l.e(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L1f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L28
            L1f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.p557z.C13706j.m4090h(r0, r2, r1)
                if (r0 == 0) goto L35
            L28:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f26718f = r9
                return
            L35:
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.C11993a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            l.f(objArr, "args");
            mo10003b(objArr);
            C11815z c11815z = new C11815z(3);
            c11815z.m10309a(this.f26718f);
            c11815z.m10308b(objArr);
            c11815z.m10309a(null);
            return mo9981l().newInstance(c11815z.m10306d(new Object[c11815z.m10307c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$b */
    /* loaded from: classes3.dex */
    public static final class C11994b extends AbstractC11992e<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C11994b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.e0.d.l.f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.e0.d.l.e(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.e0.d.l.e(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L1f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L27
            L1f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = kotlin.p557z.C13706j.m4090h(r0, r2, r1)
                if (r0 == 0) goto L32
            L27:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            L32:
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.C11994b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            l.f(objArr, "args");
            mo10003b(objArr);
            C11815z c11815z = new C11815z(2);
            c11815z.m10308b(objArr);
            c11815z.m10309a(null);
            return mo9981l().newInstance(c11815z.m10306d(new Object[c11815z.m10307c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$c */
    /* loaded from: classes3.dex */
    public static final class C11995c extends AbstractC11992e<Constructor<?>> implements InterfaceC11989c {

        /* renamed from: f */
        private final Object f26719f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C11995c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.e0.d.l.f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.e0.d.l.e(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.e0.d.l.e(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f26719f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.C11995c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            l.f(objArr, "args");
            mo10003b(objArr);
            C11815z c11815z = new C11815z(2);
            c11815z.m10309a(this.f26719f);
            c11815z.m10308b(objArr);
            return mo9981l().newInstance(c11815z.m10306d(new Object[c11815z.m10307c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$d */
    /* loaded from: classes3.dex */
    public static final class C11996d {
        private C11996d() {
        }

        public /* synthetic */ C11996d(g gVar) {
            this();
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$e */
    /* loaded from: classes3.dex */
    public static final class C11997e extends AbstractC11992e<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C11997e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.e0.d.l.f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.e0.d.l.e(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.String r1 = "klass"
                kotlin.e0.d.l.e(r0, r1)
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L29
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L29
                r4 = r1
                goto L2b
            L29:
                r0 = 0
                r4 = r0
            L2b:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.e0.d.l.e(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.C11997e.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            l.f(objArr, "args");
            mo10003b(objArr);
            return mo9981l().newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11998f extends AbstractC11992e<Field> {

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$f$a */
        /* loaded from: classes3.dex */
        public static final class C11999a extends AbstractC11998f implements InterfaceC11989c {

            /* renamed from: f */
            private final Object f26720f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11999a(Field field, Object obj) {
                super(field, false, null);
                l.f(field, "field");
                this.f26720f = obj;
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC11998f, kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                l.f(objArr, "args");
                mo10003b(objArr);
                return mo9981l().get(this.f26720f);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$f$b */
        /* loaded from: classes3.dex */
        public static final class C12000b extends AbstractC11998f implements InterfaceC11989c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12000b(Field field) {
                super(field, false, null);
                l.f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$f$c */
        /* loaded from: classes3.dex */
        public static final class C12001c extends AbstractC11998f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12001c(Field field) {
                super(field, true, null);
                l.f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$f$d */
        /* loaded from: classes3.dex */
        public static final class C12002d extends AbstractC11998f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12002d(Field field) {
                super(field, true, null);
                l.f(field, "field");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e
            /* renamed from: b */
            public void mo10003b(Object[] objArr) {
                l.f(objArr, "args");
                super.mo10003b(objArr);
                m10005c(C13706j.m4075x(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$f$e */
        /* loaded from: classes3.dex */
        public static final class C12003e extends AbstractC11998f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12003e(Field field) {
                super(field, false, null);
                l.f(field, "field");
            }
        }

        public /* synthetic */ AbstractC11998f(Field field, boolean z, g gVar) {
            this(field, z);
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            l.f(objArr, "args");
            mo10003b(objArr);
            return mo9981l().get(m10004d() != null ? C13706j.m4076w(objArr) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private AbstractC11998f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.e0.d.l.e(r2, r0)
                if (r8 == 0) goto L10
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L11
            L10:
                r8 = 0
            L11:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC11998f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$g */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12004g extends AbstractC11992e<Field> {

        /* renamed from: f */
        private final boolean f26721f;

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$g$a */
        /* loaded from: classes3.dex */
        public static final class C12005a extends AbstractC12004g implements InterfaceC11989c {

            /* renamed from: g */
            private final Object f26722g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12005a(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                l.f(field, "field");
                this.f26722g = obj;
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC12004g, kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                l.f(objArr, "args");
                mo10003b(objArr);
                mo9981l().set(this.f26722g, C13706j.m4076w(objArr));
                return C13666w.f30112a;
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$g$b */
        /* loaded from: classes3.dex */
        public static final class C12006b extends AbstractC12004g implements InterfaceC11989c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12006b(Field field, boolean z) {
                super(field, z, false, null);
                l.f(field, "field");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC12004g, kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                l.f(objArr, "args");
                mo10003b(objArr);
                mo9981l().set(null, C13706j.m4111H(objArr));
                return C13666w.f30112a;
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$g$c */
        /* loaded from: classes3.dex */
        public static final class C12007c extends AbstractC12004g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12007c(Field field, boolean z) {
                super(field, z, true, null);
                l.f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$g$d */
        /* loaded from: classes3.dex */
        public static final class C12008d extends AbstractC12004g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12008d(Field field, boolean z) {
                super(field, z, true, null);
                l.f(field, "field");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC12004g, kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e
            /* renamed from: b */
            public void mo10003b(Object[] objArr) {
                l.f(objArr, "args");
                super.mo10003b(objArr);
                m10005c(C13706j.m4075x(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$g$e */
        /* loaded from: classes3.dex */
        public static final class C12009e extends AbstractC12004g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12009e(Field field, boolean z) {
                super(field, z, false, null);
                l.f(field, "field");
            }
        }

        public /* synthetic */ AbstractC12004g(Field field, boolean z, boolean z2, g gVar) {
            this(field, z, z2);
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            l.f(objArr, "args");
            mo10003b(objArr);
            mo9981l().set(m10004d() != null ? C13706j.m4076w(objArr) : null, C13706j.m4111H(objArr));
            return C13666w.f30112a;
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e
        /* renamed from: b */
        public void mo10003b(Object[] objArr) {
            l.f(objArr, "args");
            super.mo10003b(objArr);
            if (this.f26721f && C13706j.m4111H(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private AbstractC12004g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "Void.TYPE"
                kotlin.e0.d.l.e(r2, r0)
                if (r9 == 0) goto Le
                java.lang.Class r9 = r7.getDeclaringClass()
                goto Lf
            Le:
                r9 = 0
            Lf:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r0 = r7.getGenericType()
                java.lang.String r1 = "field.genericType"
                kotlin.e0.d.l.e(r0, r1)
                r4[r9] = r0
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f26721f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC12004g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: kotlin.j0.o.c.o0.e$h */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12010h extends AbstractC11992e<Method> {

        /* renamed from: f */
        private final boolean f26723f;

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$h$a */
        /* loaded from: classes3.dex */
        public static final class C12011a extends AbstractC12010h implements InterfaceC11989c {

            /* renamed from: g */
            private final Object f26724g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12011a(Method method, Object obj) {
                super(method, false, null, 4, null);
                l.f(method, "method");
                this.f26724g = obj;
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                l.f(objArr, "args");
                mo10003b(objArr);
                return m10002e(this.f26724g, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$h$b */
        /* loaded from: classes3.dex */
        public static final class C12012b extends AbstractC12010h implements InterfaceC11989c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12012b(Method method) {
                super(method, false, null, 4, null);
                l.f(method, "method");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                l.f(objArr, "args");
                mo10003b(objArr);
                return m10002e(null, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$h$c */
        /* loaded from: classes3.dex */
        public static final class C12013c extends AbstractC12010h implements InterfaceC11989c {

            /* renamed from: g */
            private final Object f26725g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C12013c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.e0.d.l.f(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    kotlin.e0.d.l.e(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L16
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L1d
                L16:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.p557z.C13706j.m4090h(r0, r2, r1)
                    if (r0 == 0) goto L26
                L1d:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r3, r0, r1)
                    r4.f26725g = r6
                    return
                L26:
                    java.lang.NullPointerException r5 = new java.lang.NullPointerException
                    java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r5.<init>(r6)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC12010h.C12013c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                l.f(objArr, "args");
                mo10003b(objArr);
                C11815z c11815z = new C11815z(2);
                c11815z.m10309a(this.f26725g);
                c11815z.m10308b(objArr);
                return m10002e(null, c11815z.m10306d(new Object[c11815z.m10307c()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$h$d */
        /* loaded from: classes3.dex */
        public static final class C12014d extends AbstractC12010h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12014d(Method method) {
                super(method, false, null, 6, null);
                l.f(method, "method");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                Object[] m4090h;
                l.f(objArr, "args");
                mo10003b(objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    m4090h = new Object[0];
                } else {
                    m4090h = C13706j.m4090h(objArr, 1, objArr.length);
                    if (m4090h == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return m10002e(obj, m4090h);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$h$e */
        /* loaded from: classes3.dex */
        public static final class C12015e extends AbstractC12010h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12015e(Method method) {
                super(method, true, null, 4, null);
                l.f(method, "method");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                Object[] m4090h;
                l.f(objArr, "args");
                mo10003b(objArr);
                m10005c(C13706j.m4075x(objArr));
                if (objArr.length <= 1) {
                    m4090h = new Object[0];
                } else {
                    m4090h = C13706j.m4090h(objArr, 1, objArr.length);
                    if (m4090h == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return m10002e(null, m4090h);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: kotlin.j0.o.c.o0.e$h$f */
        /* loaded from: classes3.dex */
        public static final class C12016f extends AbstractC12010h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12016f(Method method) {
                super(method, false, null, 6, null);
                l.f(method, "method");
            }

            @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
            /* renamed from: a */
            public Object mo9985a(Object[] objArr) {
                l.f(objArr, "args");
                mo10003b(objArr);
                return m10002e(null, objArr);
            }
        }

        public /* synthetic */ AbstractC12010h(Method method, boolean z, Type[] typeArr, g gVar) {
            this(method, z, typeArr);
        }

        /* renamed from: e */
        protected final Object m10002e(Object obj, Object[] objArr) {
            l.f(objArr, "args");
            return this.f26723f ? C13666w.f30112a : mo9981l().invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ AbstractC12010h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.e0.d.g r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto Le
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            Le:
                r4 = r4 & 4
                if (r4 == 0) goto L1b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                kotlin.e0.d.l.e(r3, r4)
            L1b:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC12010h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.e0.d.g):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private AbstractC12010h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                kotlin.e0.d.l.e(r2, r0)
                if (r8 == 0) goto L10
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L11
            L10:
                r8 = 0
            L11:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.mo9983j()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.e0.d.l.b(r7, r8)
                r6.f26723f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.AbstractC12010h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r1 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AbstractC11992e(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f26715b = r1
            r0.f26716c = r2
            r0.f26717d = r3
            if (r3 == 0) goto L2a
            kotlin.e0.d.z r1 = new kotlin.e0.d.z
            r2 = 2
            r1.<init>(r2)
            r1.m10309a(r3)
            r1.m10308b(r4)
            int r2 = r1.m10307c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.m10306d(r2)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            java.util.List r1 = kotlin.p557z.C13722p.m3935h(r1)
            if (r1 == 0) goto L2a
            goto L2e
        L2a:
            java.util.List r1 = kotlin.p557z.C13706j.m4097Z(r4)
        L2e:
            r0.f26714a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    /* renamed from: b */
    public void mo10003b(Object[] objArr) {
        l.f(objArr, "args");
        InterfaceC11990d.C11991a.m10006a(this, objArr);
    }

    /* renamed from: c */
    protected final void m10005c(Object obj) {
        if (obj == null || !this.f26715b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* renamed from: d */
    public final Class<?> m10004d() {
        return this.f26717d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: j */
    public final Type mo9983j() {
        return this.f26716c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: k */
    public List<Type> mo9982k() {
        return this.f26714a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: l */
    public final M mo9981l() {
        return this.f26715b;
    }

    public /* synthetic */ AbstractC11992e(Member member, Type type, Class cls, Type[] typeArr, g gVar) {
        this(member, type, cls, typeArr);
    }
}
