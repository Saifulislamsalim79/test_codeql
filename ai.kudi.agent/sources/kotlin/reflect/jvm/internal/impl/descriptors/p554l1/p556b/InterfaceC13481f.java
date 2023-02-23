package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13726r;
/* compiled from: ReflectJavaAnnotationOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.f */
/* loaded from: classes3.dex */
public interface InterfaceC13481f extends InterfaceC12272d {

    /* compiled from: ReflectJavaAnnotationOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.f$a */
    /* loaded from: classes3.dex */
    public static final class C13482a {
        /* renamed from: a */
        public static C13477c m4874a(InterfaceC13481f interfaceC13481f, C12609c c12609c) {
            Annotation[] declaredAnnotations;
            l.f(interfaceC13481f, "this");
            l.f(c12609c, "fqName");
            AnnotatedElement mo4788C = interfaceC13481f.mo4788C();
            if (mo4788C == null || (declaredAnnotations = mo4788C.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C13483g.m4871a(declaredAnnotations, c12609c);
        }

        /* renamed from: b */
        public static List<C13477c> m4873b(InterfaceC13481f interfaceC13481f) {
            List<C13477c> m3891e;
            l.f(interfaceC13481f, "this");
            AnnotatedElement mo4788C = interfaceC13481f.mo4788C();
            Annotation[] declaredAnnotations = mo4788C == null ? null : mo4788C.getDeclaredAnnotations();
            if (declaredAnnotations == null) {
                m3891e = C13726r.m3891e();
                return m3891e;
            }
            return C13483g.m4870b(declaredAnnotations);
        }

        /* renamed from: c */
        public static boolean m4872c(InterfaceC13481f interfaceC13481f) {
            l.f(interfaceC13481f, "this");
            return false;
        }
    }

    /* renamed from: C */
    AnnotatedElement mo4788C();
}
