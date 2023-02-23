package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.AbstractC12679h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: DescriptorResolverUtils.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.a */
/* loaded from: classes3.dex */
public final class C12122a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.a$a */
    /* loaded from: classes3.dex */
    public static class C12123a extends AbstractC12679h {

        /* renamed from: a */
        final /* synthetic */ InterfaceC12899p f27050a;

        /* renamed from: b */
        final /* synthetic */ Set f27051b;

        /* renamed from: c */
        final /* synthetic */ boolean f27052c;

        /* compiled from: DescriptorResolverUtils.java */
        /* renamed from: kotlin.j0.o.c.p0.d.a.b0.a$a$a */
        /* loaded from: classes3.dex */
        class C12124a implements InterfaceC11767l<InterfaceC13300b, C13666w> {
            C12124a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m9661a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: b */
            public C13666w invoke(InterfaceC13300b interfaceC13300b) {
                if (interfaceC13300b != null) {
                    C12123a.this.f27050a.mo4913a(interfaceC13300b);
                    return C13666w.f30112a;
                }
                m9661a(0);
                throw null;
            }
        }

        C12123a(InterfaceC12899p interfaceC12899p, Set set, boolean z) {
            this.f27050a = interfaceC12899p;
            this.f27051b = set;
            this.f27052c = z;
        }

        /* renamed from: f */
        private static /* synthetic */ void m9662f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.AbstractC12680i
        /* renamed from: a */
        public void mo5099a(InterfaceC13300b interfaceC13300b) {
            if (interfaceC13300b != null) {
                C12681j.m6982L(interfaceC13300b, new C12124a());
                this.f27051b.add(interfaceC13300b);
                return;
            }
            m9662f(0);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.AbstractC12680i
        /* renamed from: d */
        public void mo6994d(InterfaceC13300b interfaceC13300b, Collection<? extends InterfaceC13300b> collection) {
            if (interfaceC13300b == null) {
                m9662f(3);
                throw null;
            } else if (collection != null) {
                if (!this.f27052c || interfaceC13300b.mo5057w() == InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE) {
                    super.mo6994d(interfaceC13300b, collection);
                }
            } else {
                m9662f(4);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.AbstractC12679h
        /* renamed from: e */
        public void mo5098e(InterfaceC13300b interfaceC13300b, InterfaceC13300b interfaceC13300b2) {
            if (interfaceC13300b == null) {
                m9662f(1);
                throw null;
            } else if (interfaceC13300b2 != null) {
            } else {
                m9662f(2);
                throw null;
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m9667a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static InterfaceC13307c1 m9666b(C12614f c12614f, InterfaceC13312e interfaceC13312e) {
        if (c12614f == null) {
            m9667a(19);
            throw null;
        } else if (interfaceC13312e != null) {
            Collection<InterfaceC13309d> mo4958p = interfaceC13312e.mo4958p();
            if (mo4958p.size() != 1) {
                return null;
            }
            for (InterfaceC13307c1 interfaceC13307c1 : mo4958p.iterator().next().mo5072k()) {
                if (interfaceC13307c1.mo5012b().equals(c12614f)) {
                    return interfaceC13307c1;
                }
            }
            return null;
        } else {
            m9667a(20);
            throw null;
        }
    }

    /* renamed from: c */
    private static <D extends InterfaceC13300b> Collection<D> m9665c(C12614f c12614f, Collection<D> collection, Collection<D> collection2, InterfaceC13312e interfaceC13312e, InterfaceC12899p interfaceC12899p, C12681j c12681j, boolean z) {
        if (c12614f == null) {
            m9667a(12);
            throw null;
        } else if (collection == null) {
            m9667a(13);
            throw null;
        } else if (collection2 == null) {
            m9667a(14);
            throw null;
        } else if (interfaceC13312e == null) {
            m9667a(15);
            throw null;
        } else if (interfaceC12899p == null) {
            m9667a(16);
            throw null;
        } else if (c12681j != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            c12681j.m6958w(c12614f, collection, collection2, interfaceC13312e, new C12123a(interfaceC12899p, linkedHashSet, z));
            return linkedHashSet;
        } else {
            m9667a(17);
            throw null;
        }
    }

    /* renamed from: d */
    public static <D extends InterfaceC13300b> Collection<D> m9664d(C12614f c12614f, Collection<D> collection, Collection<D> collection2, InterfaceC13312e interfaceC13312e, InterfaceC12899p interfaceC12899p, C12681j c12681j) {
        if (c12614f == null) {
            m9667a(0);
            throw null;
        } else if (collection == null) {
            m9667a(1);
            throw null;
        } else if (collection2 == null) {
            m9667a(2);
            throw null;
        } else if (interfaceC13312e == null) {
            m9667a(3);
            throw null;
        } else if (interfaceC12899p == null) {
            m9667a(4);
            throw null;
        } else if (c12681j != null) {
            return m9665c(c12614f, collection, collection2, interfaceC13312e, interfaceC12899p, c12681j, false);
        } else {
            m9667a(5);
            throw null;
        }
    }

    /* renamed from: e */
    public static <D extends InterfaceC13300b> Collection<D> m9663e(C12614f c12614f, Collection<D> collection, Collection<D> collection2, InterfaceC13312e interfaceC13312e, InterfaceC12899p interfaceC12899p, C12681j c12681j) {
        if (c12614f == null) {
            m9667a(6);
            throw null;
        } else if (collection == null) {
            m9667a(7);
            throw null;
        } else if (collection2 == null) {
            m9667a(8);
            throw null;
        } else if (interfaceC13312e == null) {
            m9667a(9);
            throw null;
        } else if (interfaceC12899p == null) {
            m9667a(10);
            throw null;
        } else if (c12681j != null) {
            return m9665c(c12614f, collection, collection2, interfaceC13312e, interfaceC12899p, c12681j, true);
        } else {
            m9667a(11);
            throw null;
        }
    }
}
