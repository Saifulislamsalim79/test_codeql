package kotlin.p483e0;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.lang.annotation.Annotation;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.InterfaceC11786d;
import kotlin.p493j0.InterfaceC11863b;
/* compiled from: JvmClassMapping.kt */
/* renamed from: kotlin.e0.a */
/* loaded from: classes3.dex */
public final class C11754a {
    /* renamed from: a */
    public static final <T extends Annotation> InterfaceC11863b<? extends T> m10365a(T t) {
        l.f(t, "$this$annotationClass");
        Class<? extends Annotation> annotationType = t.annotationType();
        l.e(annotationType, "(this as java.lang.annot…otation).annotationType()");
        InterfaceC11863b<? extends T> m10361e = m10361e(annotationType);
        if (m10361e != null) {
            return m10361e;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
    }

    /* renamed from: b */
    public static final <T> Class<T> m10364b(InterfaceC11863b<T> interfaceC11863b) {
        l.f(interfaceC11863b, "$this$java");
        Class<T> cls = (Class<T>) ((InterfaceC11786d) interfaceC11863b).mo9979a();
        if (cls != null) {
            return cls;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: c */
    public static final <T> Class<T> m10363c(InterfaceC11863b<T> interfaceC11863b) {
        l.f(interfaceC11863b, "$this$javaObjectType");
        Class<T> cls = (Class<T>) ((InterfaceC11786d) interfaceC11863b).mo9979a();
        if (!cls.isPrimitive()) {
            if (cls != null) {
                return cls;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls = (Class<T>) Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (Class<T>) Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        cls = (Class<T>) Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        cls = (Class<T>) Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (Class<T>) Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (Class<T>) Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals(AttributeType.BOOLEAN)) {
                        cls = (Class<T>) Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals(AttributeType.FLOAT)) {
                        cls = (Class<T>) Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (Class<T>) Short.class;
                        break;
                    }
                    break;
            }
        }
        if (cls != null) {
            return cls;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: d */
    public static final <T> Class<T> m10362d(InterfaceC11863b<T> interfaceC11863b) {
        l.f(interfaceC11863b, "$this$javaPrimitiveType");
        Class<T> cls = (Class<T>) ((InterfaceC11786d) interfaceC11863b).mo9979a();
        if (cls.isPrimitive()) {
            if (cls != null) {
                return cls;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2056817302:
                    if (name.equals("java.lang.Integer")) {
                        return Integer.TYPE;
                    }
                    break;
                case -527879800:
                    if (name.equals("java.lang.Float")) {
                        return Float.TYPE;
                    }
                    break;
                case -515992664:
                    if (name.equals("java.lang.Short")) {
                        return Short.TYPE;
                    }
                    break;
                case 155276373:
                    if (name.equals("java.lang.Character")) {
                        return Character.TYPE;
                    }
                    break;
                case 344809556:
                    if (name.equals("java.lang.Boolean")) {
                        return Boolean.TYPE;
                    }
                    break;
                case 398507100:
                    if (name.equals("java.lang.Byte")) {
                        return Byte.TYPE;
                    }
                    break;
                case 398795216:
                    if (name.equals("java.lang.Long")) {
                        return Long.TYPE;
                    }
                    break;
                case 399092968:
                    if (name.equals("java.lang.Void")) {
                        return Void.TYPE;
                    }
                    break;
                case 761287205:
                    if (name.equals("java.lang.Double")) {
                        return Double.TYPE;
                    }
                    break;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final <T> InterfaceC11863b<T> m10361e(Class<T> cls) {
        l.f(cls, "$this$kotlin");
        return C11813x.m10316b(cls);
    }
}
