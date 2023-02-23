package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.EnumC12052i;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12080c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12711f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p557z.C13706j;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.c */
/* loaded from: classes3.dex */
final class C13456c {

    /* renamed from: a */
    public static final C13456c f29812a = new C13456c();

    private C13456c() {
    }

    /* renamed from: a */
    private final C12711f m4939a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            l.e(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (l.b(cls, Void.TYPE)) {
                C12608b m7384m = C12608b.m7384m(C12059k.C12060a.f26847e.m7361l());
                l.e(m7384m, "topLevel(StandardNames.FqNames.unit.toSafe())");
                return new C12711f(m7384m, i);
            }
            EnumC12052i m6824i = EnumC12757e.m6828b(cls.getName()).m6824i();
            l.e(m6824i, "get(currentClass.name).primitiveType");
            if (i > 0) {
                C12608b m7384m2 = C12608b.m7384m(m6824i.m9851b());
                l.e(m7384m2, "topLevel(primitiveType.arrayTypeFqName)");
                return new C12711f(m7384m2, i - 1);
            }
            C12608b m7384m3 = C12608b.m7384m(m6824i.m9849g());
            l.e(m7384m3, "topLevel(primitiveType.typeFqName)");
            return new C12711f(m7384m3, i);
        }
        C12608b m4893a = C13474b.m4893a(cls);
        C12080c c12080c = C12080c.f26925a;
        C12609c m7395b = m4893a.m7395b();
        l.e(m7395b, "javaClassId.asSingleFqName()");
        C12608b m9767n = c12080c.m9767n(m7395b);
        if (m9767n != null) {
            m4893a = m9767n;
        }
        return new C12711f(m4893a, i);
    }

    /* renamed from: c */
    private final void m4937c(Class<?> cls, InterfaceC12447o.InterfaceC12451d interfaceC12451d) {
        Constructor<?>[] constructorArr;
        int i;
        int i2;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        l.e(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i3 = 0;
        while (i3 < length) {
            Constructor<?> constructor = declaredConstructors[i3];
            int i4 = i3 + 1;
            C12614f m7346n = C12614f.m7346n("<init>");
            l.e(m7346n, "special(\"<init>\")");
            C13471n c13471n = C13471n.f29826a;
            l.e(constructor, "constructor");
            InterfaceC12447o.InterfaceC12452e mo8869b = interfaceC12451d.mo8869b(m7346n, c13471n.m4900a(constructor));
            if (mo8869b == null) {
                constructorArr = declaredConstructors;
                i = length;
                i2 = i4;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                l.e(declaredAnnotations, "constructor.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i5 = 0;
                while (i5 < length2) {
                    Annotation annotation = declaredAnnotations[i5];
                    i5++;
                    l.e(annotation, "annotation");
                    m4934f(mo8869b, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                l.e(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length4 = parameterAnnotations.length;
                    int i6 = 0;
                    while (i6 < length4) {
                        Annotation[] annotationArr = parameterAnnotations[i6];
                        int i7 = i6 + 1;
                        l.e(annotationArr, "annotations");
                        int length5 = annotationArr.length;
                        int i8 = 0;
                        while (i8 < length5) {
                            Annotation annotation2 = annotationArr[i8];
                            i8++;
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            Class<?> m10364b = C11754a.m10364b(C11754a.m10365a(annotation2));
                            int i9 = length;
                            int i10 = i4;
                            C12608b m4893a = C13474b.m4893a(m10364b);
                            int i11 = length3;
                            l.e(annotation2, "annotation");
                            InterfaceC12447o.InterfaceC12448a mo8868c = mo8869b.mo8868c(i6 + length3, m4893a, new C13455b(annotation2));
                            if (mo8868c != null) {
                                f29812a.m4932h(mo8868c, annotation2, m10364b);
                            }
                            length = i9;
                            declaredConstructors = constructorArr2;
                            i4 = i10;
                            length3 = i11;
                        }
                        i6 = i7;
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                i2 = i4;
                mo8869b.mo8872a();
            }
            length = i;
            declaredConstructors = constructorArr;
            i3 = i2;
        }
    }

    /* renamed from: d */
    private final void m4936d(Class<?> cls, InterfaceC12447o.InterfaceC12451d interfaceC12451d) {
        Field[] declaredFields = cls.getDeclaredFields();
        l.e(declaredFields, "klass.declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            i++;
            C12614f m7349i = C12614f.m7349i(field.getName());
            l.e(m7349i, "identifier(field.name)");
            C13471n c13471n = C13471n.f29826a;
            l.e(field, "field");
            InterfaceC12447o.InterfaceC12450c mo8870a = interfaceC12451d.mo8870a(m7349i, c13471n.m4899b(field), null);
            if (mo8870a != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                l.e(declaredAnnotations, "field.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i2 = 0;
                while (i2 < length2) {
                    Annotation annotation = declaredAnnotations[i2];
                    i2++;
                    l.e(annotation, "annotation");
                    m4934f(mo8870a, annotation);
                }
                mo8870a.mo8872a();
            }
        }
    }

    /* renamed from: e */
    private final void m4935e(Class<?> cls, InterfaceC12447o.InterfaceC12451d interfaceC12451d) {
        Method[] methodArr;
        int i;
        Method[] declaredMethods = cls.getDeclaredMethods();
        l.e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i2 = 0;
        while (i2 < length) {
            Method method = declaredMethods[i2];
            i2++;
            C12614f m7349i = C12614f.m7349i(method.getName());
            l.e(m7349i, "identifier(method.name)");
            C13471n c13471n = C13471n.f29826a;
            l.e(method, "method");
            InterfaceC12447o.InterfaceC12452e mo8869b = interfaceC12451d.mo8869b(m7349i, c13471n.m4898c(method));
            if (mo8869b == null) {
                methodArr = declaredMethods;
                i = length;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                l.e(declaredAnnotations, "method.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i3 = 0;
                while (i3 < length2) {
                    Annotation annotation = declaredAnnotations[i3];
                    i3++;
                    l.e(annotation, "annotation");
                    m4934f(mo8869b, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                l.e(parameterAnnotations, "method.parameterAnnotations");
                int length3 = parameterAnnotations.length;
                int i4 = 0;
                while (i4 < length3) {
                    Annotation[] annotationArr = parameterAnnotations[i4];
                    int i5 = i4 + 1;
                    l.e(annotationArr, "annotations");
                    int length4 = annotationArr.length;
                    int i6 = 0;
                    while (i6 < length4) {
                        Annotation annotation2 = annotationArr[i6];
                        i6++;
                        Class<?> m10364b = C11754a.m10364b(C11754a.m10365a(annotation2));
                        Method[] methodArr2 = declaredMethods;
                        C12608b m4893a = C13474b.m4893a(m10364b);
                        int i7 = length;
                        l.e(annotation2, "annotation");
                        InterfaceC12447o.InterfaceC12448a mo8868c = mo8869b.mo8868c(i4, m4893a, new C13455b(annotation2));
                        if (mo8868c != null) {
                            f29812a.m4932h(mo8868c, annotation2, m10364b);
                        }
                        declaredMethods = methodArr2;
                        length = i7;
                    }
                    i4 = i5;
                }
                methodArr = declaredMethods;
                i = length;
                mo8869b.mo8872a();
            }
            declaredMethods = methodArr;
            length = i;
        }
    }

    /* renamed from: f */
    private final void m4934f(InterfaceC12447o.InterfaceC12450c interfaceC12450c, Annotation annotation) {
        Class<?> m10364b = C11754a.m10364b(C11754a.m10365a(annotation));
        InterfaceC12447o.InterfaceC12448a mo8871b = interfaceC12450c.mo8871b(C13474b.m4893a(m10364b), new C13455b(annotation));
        if (mo8871b == null) {
            return;
        }
        f29812a.m4932h(mo8871b, annotation, m10364b);
    }

    /* renamed from: g */
    private final void m4933g(InterfaceC12447o.InterfaceC12448a interfaceC12448a, C12614f c12614f, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (!l.b(cls, Class.class)) {
            set = C13463i.f29819a;
            if (set.contains(cls)) {
                interfaceC12448a.mo8881c(c12614f, obj);
                return;
            } else if (C13474b.m4887g(cls)) {
                if (!cls.isEnum()) {
                    cls = cls.getEnclosingClass();
                }
                l.e(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                C12608b m4893a = C13474b.m4893a(cls);
                C12614f m7349i = C12614f.m7349i(((Enum) obj).name());
                l.e(m7349i, "identifier((value as Enum<*>).name)");
                interfaceC12448a.mo8880d(c12614f, m4893a, m7349i);
                return;
            } else if (Annotation.class.isAssignableFrom(cls)) {
                Class<?>[] interfaces = cls.getInterfaces();
                l.e(interfaces, "clazz.interfaces");
                Class<?> cls2 = (Class) C13706j.m4106N(interfaces);
                l.e(cls2, "annotationClass");
                InterfaceC12447o.InterfaceC12448a mo8879e = interfaceC12448a.mo8879e(c12614f, C13474b.m4893a(cls2));
                if (mo8879e == null) {
                    return;
                }
                m4932h(mo8879e, (Annotation) obj, cls2);
                return;
            } else if (cls.isArray()) {
                InterfaceC12447o.InterfaceC12449b mo8878f = interfaceC12448a.mo8878f(c12614f);
                if (mo8878f == null) {
                    return;
                }
                Class<?> componentType = cls.getComponentType();
                int i = 0;
                if (componentType.isEnum()) {
                    l.e(componentType, "componentType");
                    C12608b m4893a2 = C13474b.m4893a(componentType);
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i < length) {
                        Object obj2 = objArr[i];
                        i++;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Enum<*>");
                        }
                        C12614f m7349i2 = C12614f.m7349i(((Enum) obj2).name());
                        l.e(m7349i2, "identifier((element as Enum<*>).name)");
                        mo8878f.mo8875c(m4893a2, m7349i2);
                    }
                } else if (l.b(componentType, Class.class)) {
                    Object[] objArr2 = (Object[]) obj;
                    int length2 = objArr2.length;
                    while (i < length2) {
                        Object obj3 = objArr2[i];
                        i++;
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
                        }
                        mo8878f.mo8873e(m4939a((Class) obj3));
                    }
                } else if (Annotation.class.isAssignableFrom(componentType)) {
                    Object[] objArr3 = (Object[]) obj;
                    int length3 = objArr3.length;
                    while (i < length3) {
                        Object obj4 = objArr3[i];
                        i++;
                        l.e(componentType, "componentType");
                        InterfaceC12447o.InterfaceC12448a mo8874d = mo8878f.mo8874d(C13474b.m4893a(componentType));
                        if (mo8874d != null) {
                            if (obj4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Annotation");
                            }
                            m4932h(mo8874d, (Annotation) obj4, componentType);
                        }
                    }
                } else {
                    Object[] objArr4 = (Object[]) obj;
                    int length4 = objArr4.length;
                    while (i < length4) {
                        Object obj5 = objArr4[i];
                        i++;
                        mo8878f.mo8876b(obj5);
                    }
                }
                mo8878f.mo8877a();
                return;
            } else {
                throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
            }
        }
        interfaceC12448a.mo8882b(c12614f, m4939a((Class) obj));
    }

    /* renamed from: h */
    private final void m4932h(InterfaceC12447o.InterfaceC12448a interfaceC12448a, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        l.e(declaredMethods, "annotationType.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            i++;
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                l.d(invoke);
                C12614f m7349i = C12614f.m7349i(method.getName());
                l.e(m7349i, "identifier(method.name)");
                m4933g(interfaceC12448a, m7349i, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC12448a.mo8883a();
    }

    /* renamed from: b */
    public final void m4938b(Class<?> cls, InterfaceC12447o.InterfaceC12450c interfaceC12450c) {
        l.f(cls, "klass");
        l.f(interfaceC12450c, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        l.e(declaredAnnotations, "klass.declaredAnnotations");
        int length = declaredAnnotations.length;
        int i = 0;
        while (i < length) {
            Annotation annotation = declaredAnnotations[i];
            i++;
            l.e(annotation, "annotation");
            m4934f(interfaceC12450c, annotation);
        }
        interfaceC12450c.mo8872a();
    }

    /* renamed from: i */
    public final void m4931i(Class<?> cls, InterfaceC12447o.InterfaceC12451d interfaceC12451d) {
        l.f(cls, "klass");
        l.f(interfaceC12451d, "memberVisitor");
        m4935e(cls, interfaceC12451d);
        m4937c(cls, interfaceC12451d);
        m4936d(cls, interfaceC12451d);
    }
}
