package com.google.firebase.database.p131s.p134i0.p135o;

import android.util.Log;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.e;
import com.google.firebase.database.h;
import com.google.firebase.database.k;
import com.google.firebase.database.m;
import com.google.firebase.database.p131s.p134i0.C5795m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: CustomClassMapper.java */
/* renamed from: com.google.firebase.database.s.i0.o.a */
/* loaded from: classes2.dex */
public class C5798a {

    /* renamed from: a */
    private static final ConcurrentMap<Class<?>, C5799a<?>> f14234a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomClassMapper.java */
    /* renamed from: com.google.firebase.database.s.i0.o.a$a */
    /* loaded from: classes2.dex */
    public static class C5799a<T> {

        /* renamed from: a */
        private final Class<T> f14235a;

        /* renamed from: b */
        private final Constructor<T> f14236b;

        /* renamed from: c */
        private final boolean f14237c;

        /* renamed from: d */
        private final boolean f14238d;

        /* renamed from: e */
        private final Map<String, String> f14239e = new HashMap();

        /* renamed from: g */
        private final Map<String, Method> f14241g = new HashMap();

        /* renamed from: f */
        private final Map<String, Method> f14240f = new HashMap();

        /* renamed from: h */
        private final Map<String, Field> f14242h = new HashMap();

        public C5799a(Class<T> cls) {
            Constructor<T> constructor;
            Method[] methods;
            Field[] fields;
            Method[] declaredMethods;
            Field[] declaredFields;
            this.f14235a = cls;
            this.f14237c = cls.isAnnotationPresent(m.class);
            this.f14238d = !cls.isAnnotationPresent(h.class);
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            this.f14236b = constructor;
            for (Method method : cls.getMethods()) {
                if (m23698m(method)) {
                    String m23703h = m23703h(method);
                    m23709b(m23703h);
                    method.setAccessible(true);
                    if (!this.f14240f.containsKey(m23703h)) {
                        this.f14240f.put(m23703h, method);
                    } else {
                        throw new DatabaseException("Found conflicting getters for name: " + method.getName());
                    }
                }
            }
            for (Field field : cls.getFields()) {
                if (m23699l(field)) {
                    m23709b(m23704g(field));
                }
            }
            Class<T> cls2 = cls;
            do {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (m23697n(method2)) {
                        String m23703h2 = m23703h(method2);
                        String str = this.f14239e.get(m23703h2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else if (str.equals(m23703h2)) {
                            Method method3 = this.f14241g.get(m23703h2);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f14241g.put(m23703h2, method2);
                            } else if (!m23705f(method2, method3)) {
                                throw new DatabaseException("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        } else {
                            throw new DatabaseException("Found setter with invalid case-sensitive name: " + method2.getName());
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String m23704g = m23704g(field2);
                    if (this.f14239e.containsKey(m23704g.toLowerCase(Locale.US)) && !this.f14242h.containsKey(m23704g)) {
                        field2.setAccessible(true);
                        this.f14242h.put(m23704g, field2);
                    }
                }
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } while (!cls2.equals(Object.class));
            if (this.f14239e.isEmpty()) {
                throw new DatabaseException("No properties to serialize found on class " + cls.getName());
            }
        }

        /* renamed from: b */
        private void m23709b(String str) {
            String put = this.f14239e.put(str.toLowerCase(Locale.US), str);
            if (put == null || str.equals(put)) {
                return;
            }
            throw new DatabaseException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(Locale.US));
        }

        /* renamed from: c */
        private static String m23708c(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(k.class)) {
                return accessibleObject.getAnnotation(k.class).value();
            }
            return null;
        }

        /* renamed from: f */
        private static boolean m23705f(Method method, Method method2) {
            C5795m.m23744g(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            C5795m.m23744g(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            C5795m.m23744g(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            C5795m.m23744g(parameterTypes.length == 1, "Expected exactly one parameter");
            C5795m.m23744g(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        /* renamed from: g */
        private static String m23704g(Field field) {
            String m23708c = m23708c(field);
            return m23708c != null ? m23708c : field.getName();
        }

        /* renamed from: h */
        private static String m23703h(Method method) {
            String m23708c = m23708c(method);
            return m23708c != null ? m23708c : m23700k(method.getName());
        }

        /* renamed from: i */
        private Type m23702i(Type type, Map<TypeVariable<Class<T>>, Type> map) {
            if (type instanceof TypeVariable) {
                Type type2 = map.get(type);
                if (type2 != null) {
                    return type2;
                }
                throw new IllegalStateException("Could not resolve type " + type);
            }
            return type;
        }

        /* renamed from: k */
        private static String m23700k(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i = 0; i < 3; i++) {
                String str3 = strArr[i];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                char[] charArray = str.substring(str2.length()).toCharArray();
                for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
                    charArray[i2] = Character.toLowerCase(charArray[i2]);
                }
                return new String(charArray);
            }
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
        }

        /* renamed from: l */
        private static boolean m23699l(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(e.class)) ? false : true;
        }

        /* renamed from: m */
        private static boolean m23698m(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(e.class)) ? false : true;
        }

        /* renamed from: n */
        private static boolean m23697n(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(e.class);
        }

        /* renamed from: d */
        public T m23707d(Map<String, Object> map) {
            return m23706e(map, Collections.emptyMap());
        }

        /* renamed from: e */
        public T m23706e(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2) {
            Constructor<T> constructor = this.f14236b;
            if (constructor != null) {
                try {
                    T newInstance = constructor.newInstance(new Object[0]);
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (this.f14241g.containsKey(key)) {
                            Method method = this.f14241g.get(key);
                            Type[] genericParameterTypes = method.getGenericParameterTypes();
                            if (genericParameterTypes.length == 1) {
                                try {
                                    method.invoke(newInstance, C5798a.m23714o(entry.getValue(), m23702i(genericParameterTypes[0], map2)));
                                } catch (IllegalAccessException e) {
                                    throw new RuntimeException(e);
                                } catch (InvocationTargetException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                throw new IllegalStateException("Setter does not have exactly one parameter");
                            }
                        } else if (this.f14242h.containsKey(key)) {
                            Field field = this.f14242h.get(key);
                            try {
                                field.set(newInstance, C5798a.m23714o(entry.getValue(), m23702i(field.getGenericType(), map2)));
                            } catch (IllegalAccessException e3) {
                                throw new RuntimeException(e3);
                            }
                        } else {
                            String str = "No setter/field for " + key + " found on class " + this.f14235a.getName();
                            if (this.f14239e.containsKey(key.toLowerCase(Locale.US))) {
                                str = str + " (fields/setters are case sensitive!)";
                            }
                            if (!this.f14237c) {
                                if (this.f14238d) {
                                    Log.w("ClassMapper", str);
                                }
                            } else {
                                throw new DatabaseException(str);
                            }
                        }
                    }
                    return newInstance;
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InstantiationException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException(e6);
                }
            }
            throw new DatabaseException("Class " + this.f14235a.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
        }

        /* renamed from: j */
        public Map<String, Object> m23701j(T t) {
            Object obj;
            if (this.f14235a.isAssignableFrom(t.getClass())) {
                HashMap hashMap = new HashMap();
                for (String str : this.f14239e.values()) {
                    if (this.f14240f.containsKey(str)) {
                        try {
                            obj = this.f14240f.get(str).invoke(t, new Object[0]);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        Field field = this.f14242h.get(str);
                        if (field != null) {
                            try {
                                obj = field.get(t);
                            } catch (IllegalAccessException e3) {
                                throw new RuntimeException(e3);
                            }
                        } else {
                            throw new IllegalStateException("Bean property without field or getter:" + str);
                        }
                    }
                    hashMap.put(str, C5798a.m23711r(obj));
                }
                return hashMap;
            }
            throw new IllegalArgumentException("Can't serialize object of class " + t.getClass() + " with BeanMapper for class " + this.f14235a);
        }
    }

    /* renamed from: c */
    private static <T> T m23726c(Object obj, Class<T> cls) {
        C5799a m23712q = m23712q(cls);
        if (obj instanceof Map) {
            return (T) m23712q.m23707d(m23713p(obj));
        }
        throw new DatabaseException("Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
    }

    /* renamed from: d */
    private static Boolean m23725d(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new DatabaseException("Failed to convert value of type " + obj.getClass().getName() + " to boolean");
    }

    /* renamed from: e */
    private static Double m23724e(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Long) {
            Long l = (Long) obj;
            Double valueOf = Double.valueOf(l.doubleValue());
            if (valueOf.longValue() == l.longValue()) {
                return valueOf;
            }
            throw new DatabaseException("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
        } else if (obj instanceof Double) {
            return (Double) obj;
        } else {
            throw new DatabaseException("Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
    }

    /* renamed from: f */
    private static Integer m23723f(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            throw new DatabaseException("Failed to convert a value of type " + obj.getClass().getName() + " to int");
        }
        Number number = (Number) obj;
        double doubleValue = number.doubleValue();
        if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
            return Integer.valueOf(number.intValue());
        }
        throw new DatabaseException("Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
    }

    /* renamed from: g */
    private static Long m23722g(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
                return Long.valueOf(d.longValue());
            }
            throw new DatabaseException("Numeric value out of 64-bit long range: " + d + ". Did you mean to use a double instead of a long?");
        }
        throw new DatabaseException("Failed to convert a value of type " + obj.getClass().getName() + " to long");
    }

    /* renamed from: h */
    private static String m23721h(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new DatabaseException("Failed to convert value of type " + obj.getClass().getName() + " to String");
    }

    /* renamed from: i */
    public static <T> T m23720i(Object obj, Class<T> cls) {
        return (T) m23718k(obj, cls);
    }

    /* renamed from: j */
    public static Object m23719j(Object obj) {
        return m23711r(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    private static <T> T m23718k(Object obj, Class<T> cls) {
        if (obj == 0) {
            return null;
        }
        if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                return (T) m23721h(obj);
            }
            if (!cls.isArray()) {
                if (cls.getTypeParameters().length <= 0) {
                    if (cls.equals(Object.class)) {
                        return obj;
                    }
                    if (cls.isEnum()) {
                        return (T) m23717l(obj, cls);
                    }
                    return (T) m23726c(obj, cls);
                }
                throw new DatabaseException("Class " + cls.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
            }
            throw new DatabaseException("Converting to Arrays is not supported, please use Listsinstead");
        }
        return (T) m23715n(obj, cls);
    }

    /* renamed from: l */
    private static <T> T m23717l(Object obj, Class<T> cls) {
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                return (T) Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
                throw new DatabaseException("Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
            }
        }
        throw new DatabaseException("Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, T, java.util.ArrayList] */
    /* renamed from: m */
    private static <T> T m23716m(Object obj, ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List<Object> list = (List) obj;
                ?? r0 = (T) new ArrayList(list.size());
                for (Object obj2 : list) {
                    r0.add(m23714o(obj2, type));
                }
                return r0;
            }
            throw new DatabaseException("Expected a List while deserializing, but got a " + obj.getClass());
        } else if (Map.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (type2.equals(String.class)) {
                Map<String, Object> m23713p = m23713p(obj);
                ?? r02 = (T) new HashMap();
                for (Map.Entry<String, Object> entry : m23713p.entrySet()) {
                    r02.put(entry.getKey(), m23714o(entry.getValue(), type3));
                }
                return r02;
            }
            throw new DatabaseException("Only Maps with string keys are supported, but found Map with key type " + type2);
        } else if (!Collection.class.isAssignableFrom(cls)) {
            Map<String, Object> m23713p2 = m23713p(obj);
            C5799a m23712q = m23712q(cls);
            HashMap hashMap = new HashMap();
            TypeVariable<Class<T>>[] typeParameters = m23712q.f14235a.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == typeParameters.length) {
                for (int i = 0; i < typeParameters.length; i++) {
                    hashMap.put(typeParameters[i], actualTypeArguments[i]);
                }
                return (T) m23712q.m23706e(m23713p2, hashMap);
            }
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        } else {
            throw new DatabaseException("Collections are not supported, please use Lists instead");
        }
    }

    /* renamed from: n */
    private static <T> T m23715n(Object obj, Class<T> cls) {
        if (!Integer.class.isAssignableFrom(cls) && !Integer.TYPE.isAssignableFrom(cls)) {
            if (!Boolean.class.isAssignableFrom(cls) && !Boolean.TYPE.isAssignableFrom(cls)) {
                if (!Double.class.isAssignableFrom(cls) && !Double.TYPE.isAssignableFrom(cls)) {
                    if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
                        if (!Float.class.isAssignableFrom(cls) && !Float.TYPE.isAssignableFrom(cls)) {
                            throw new DatabaseException(String.format("Deserializing values to %s is not supported", cls.getSimpleName()));
                        }
                        return (T) Float.valueOf(m23724e(obj).floatValue());
                    }
                    return (T) m23722g(obj);
                }
                return (T) m23724e(obj);
            }
            return (T) m23725d(obj);
        }
        return (T) m23723f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static <T> T m23714o(Object obj, Type type) {
        boolean z;
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return (T) m23716m(obj, (ParameterizedType) type);
        }
        if (type instanceof Class) {
            return (T) m23718k(obj, (Class) type);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length <= 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                z = upperBounds.length > 0;
                C5795m.m23744g(z, "Wildcard type " + type + " is not upper bounded.");
                return (T) m23714o(obj, upperBounds[0]);
            }
            throw new DatabaseException("Generic lower-bounded wildcard types are not supported");
        } else if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            z = bounds.length > 0;
            C5795m.m23744g(z, "Wildcard type " + type + " is not upper bounded.");
            return (T) m23714o(obj, bounds[0]);
        } else if (type instanceof GenericArrayType) {
            throw new DatabaseException("Generic Arrays are not supported, please use Lists instead");
        } else {
            throw new IllegalStateException("Unknown type encountered: " + type);
        }
    }

    /* renamed from: p */
    private static Map<String, Object> m23713p(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new DatabaseException("Expected a Map while deserializing, but got a " + obj.getClass());
    }

    /* renamed from: q */
    private static <T> C5799a<T> m23712q(Class<T> cls) {
        C5799a<T> c5799a = (C5799a<T>) f14234a.get(cls);
        if (c5799a == null) {
            C5799a<T> c5799a2 = new C5799a<>(cls);
            f14234a.put(cls, c5799a2);
            return c5799a2;
        }
        return c5799a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static <T> Object m23711r(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Number) {
            if (!(t instanceof Float) && !(t instanceof Double)) {
                if ((t instanceof Long) || (t instanceof Integer)) {
                    return t;
                }
                throw new DatabaseException(String.format("Numbers of type %s are not supported, please use an int, long, float or double", t.getClass().getSimpleName()));
            }
            Number number = (Number) t;
            double doubleValue = number.doubleValue();
            if (doubleValue <= 9.223372036854776E18d && doubleValue >= -9.223372036854776E18d && Math.floor(doubleValue) == doubleValue) {
                return Long.valueOf(number.longValue());
            }
            return Double.valueOf(doubleValue);
        } else if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        } else {
            if (!(t instanceof Character)) {
                if (t instanceof Map) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) t).entrySet()) {
                        Object key = entry.getKey();
                        if (key instanceof String) {
                            hashMap.put((String) key, m23711r(entry.getValue()));
                        } else {
                            throw new DatabaseException("Maps with non-string keys are not supported");
                        }
                    }
                    return hashMap;
                } else if (t instanceof Collection) {
                    if (t instanceof List) {
                        List<Object> list = (List) t;
                        ArrayList arrayList = new ArrayList(list.size());
                        for (Object obj : list) {
                            arrayList.add(m23711r(obj));
                        }
                        return arrayList;
                    }
                    throw new DatabaseException("Serializing Collections is not supported, please use Lists instead");
                } else if (!t.getClass().isArray()) {
                    if (t instanceof Enum) {
                        return ((Enum) t).name();
                    }
                    return m23712q(t.getClass()).m23701j(t);
                } else {
                    throw new DatabaseException("Serializing Arrays is not supported, please use Lists instead");
                }
            }
            throw new DatabaseException("Characters are not supported, please use Strings");
        }
    }
}
