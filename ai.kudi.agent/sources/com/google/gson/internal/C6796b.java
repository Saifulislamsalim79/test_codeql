package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
/* compiled from: $Gson$Types.java */
/* renamed from: com.google.gson.internal.b */
/* loaded from: classes2.dex */
public final class C6796b {

    /* renamed from: a */
    static final Type[] f16361a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.b$a */
    /* loaded from: classes2.dex */
    public static final class C6797a implements GenericArrayType, Serializable {

        /* renamed from: c */
        private final Type f16362c;

        public C6797a(Type type) {
            this.f16362c = C6796b.m20714b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C6796b.m20710f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f16362c;
        }

        public int hashCode() {
            return this.f16362c.hashCode();
        }

        public String toString() {
            return C6796b.m20695u(this.f16362c) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.b$b */
    /* loaded from: classes2.dex */
    public static final class C6798b implements ParameterizedType, Serializable {

        /* renamed from: c */
        private final Type f16363c;

        /* renamed from: d */
        private final Type f16364d;

        /* renamed from: e */
        private final Type[] f16365e;

        public C6798b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C6795a.m20717a(z);
            }
            this.f16363c = type == null ? null : C6796b.m20714b(type);
            this.f16364d = C6796b.m20714b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f16365e = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C6795a.m20716b(this.f16365e[i]);
                C6796b.m20713c(this.f16365e[i]);
                Type[] typeArr3 = this.f16365e;
                typeArr3[i] = C6796b.m20714b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C6796b.m20710f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f16365e.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f16363c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f16364d;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f16365e) ^ this.f16364d.hashCode()) ^ C6796b.m20703m(this.f16363c);
        }

        public String toString() {
            int length = this.f16365e.length;
            if (length == 0) {
                return C6796b.m20695u(this.f16364d);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C6796b.m20695u(this.f16364d));
            sb.append("<");
            sb.append(C6796b.m20695u(this.f16365e[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C6796b.m20695u(this.f16365e[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.b$c */
    /* loaded from: classes2.dex */
    public static final class C6799c implements WildcardType, Serializable {

        /* renamed from: c */
        private final Type f16366c;

        /* renamed from: d */
        private final Type f16367d;

        public C6799c(Type[] typeArr, Type[] typeArr2) {
            C6795a.m20717a(typeArr2.length <= 1);
            C6795a.m20717a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C6795a.m20716b(typeArr2[0]);
                C6796b.m20713c(typeArr2[0]);
                C6795a.m20717a(typeArr[0] == Object.class);
                this.f16367d = C6796b.m20714b(typeArr2[0]);
                this.f16366c = Object.class;
                return;
            }
            C6795a.m20716b(typeArr[0]);
            C6796b.m20713c(typeArr[0]);
            this.f16367d = null;
            this.f16366c = C6796b.m20714b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C6796b.m20710f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f16367d;
            return type != null ? new Type[]{type} : C6796b.f16361a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f16366c};
        }

        public int hashCode() {
            Type type = this.f16367d;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16366c.hashCode() + 31);
        }

        public String toString() {
            if (this.f16367d != null) {
                return "? super " + C6796b.m20695u(this.f16367d);
            } else if (this.f16366c == Object.class) {
                return "?";
            } else {
                return "? extends " + C6796b.m20695u(this.f16366c);
            }
        }
    }

    /* renamed from: a */
    public static GenericArrayType m20715a(Type type) {
        return new C6797a(type);
    }

    /* renamed from: b */
    public static Type m20714b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C6797a(m20714b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C6798b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C6797a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new C6799c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    /* renamed from: c */
    static void m20713c(Type type) {
        C6795a.m20717a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    private static Class<?> m20712d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m20711e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m20710f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                return m20711e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m20710f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public static Type m20709g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m20708h(Type type, Class<?> cls) {
        Type m20704l = m20704l(type, cls, Collection.class);
        if (m20704l instanceof WildcardType) {
            m20704l = ((WildcardType) m20704l).getUpperBounds()[0];
        }
        if (m20704l instanceof ParameterizedType) {
            return ((ParameterizedType) m20704l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: i */
    static Type m20707i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m20707i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m20707i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m20706j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m20704l = m20704l(type, cls, Map.class);
        return m20704l instanceof ParameterizedType ? ((ParameterizedType) m20704l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m20705k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C6795a.m20717a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m20705k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m20705k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: l */
    static Type m20704l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C6795a.m20717a(cls2.isAssignableFrom(cls));
        return m20700p(type, cls, m20707i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m20703m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m20702n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m20701o(Type type, Type type2, Type... typeArr) {
        return new C6798b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m20700p(Type type, Class<?> cls, Type type2) {
        return m20699q(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type m20699q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L18
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto Le
            return r10
        Le:
            r11.add(r0)
            java.lang.reflect.Type r10 = m20698r(r8, r9, r0)
            if (r10 != r0) goto L0
            return r10
        L18:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L35
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L35
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m20699q(r8, r9, r10, r11)
            if (r10 != r8) goto L30
            goto L34
        L30:
            java.lang.reflect.GenericArrayType r0 = m20715a(r8)
        L34:
            return r0
        L35:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L4b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m20699q(r8, r9, r0, r11)
            if (r0 != r8) goto L46
            goto L4a
        L46:
            java.lang.reflect.GenericArrayType r10 = m20715a(r8)
        L4a:
            return r10
        L4b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8b
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m20699q(r8, r9, r0, r11)
            if (r3 == r0) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L65:
            if (r2 >= r5) goto L80
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m20699q(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L7d
            if (r0 != 0) goto L7b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L7b:
            r4[r2] = r6
        L7d:
            int r2 = r2 + 1
            goto L65
        L80:
            if (r0 == 0) goto L8a
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = m20701o(r3, r8, r4)
        L8a:
            return r10
        L8b:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lbd
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lab
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m20699q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto Lbd
            java.lang.reflect.WildcardType r8 = m20696t(r8)
            return r8
        Lab:
            int r0 = r3.length
            if (r0 != r1) goto Lbd
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m20699q(r8, r9, r0, r11)     // Catch: java.lang.Throwable -> Lbe
            r9 = r3[r2]
            if (r8 == r9) goto Lbd
            java.lang.reflect.WildcardType r8 = m20697s(r8)
            return r8
        Lbd:
            return r10
        Lbe:
            r8 = move-exception
            goto Lc1
        Lc0:
            throw r8
        Lc1:
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C6796b.m20699q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m20698r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m20712d = m20712d(typeVariable);
        if (m20712d == null) {
            return typeVariable;
        }
        Type m20707i = m20707i(type, cls, m20712d);
        if (m20707i instanceof ParameterizedType) {
            return ((ParameterizedType) m20707i).getActualTypeArguments()[m20702n(m20712d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* renamed from: s */
    public static WildcardType m20697s(Type type) {
        return new C6799c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f16361a);
    }

    /* renamed from: t */
    public static WildcardType m20696t(Type type) {
        return new C6799c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* renamed from: u */
    public static String m20695u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
