package io.intercom.com.google.gson.p418t;

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
/* renamed from: io.intercom.com.google.gson.t.b */
/* loaded from: classes3.dex */
public final class C10944b {

    /* renamed from: a */
    static final Type[] f24938a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: io.intercom.com.google.gson.t.b$a */
    /* loaded from: classes3.dex */
    public static final class C10945a implements GenericArrayType, Serializable {

        /* renamed from: c */
        private final Type f24939c;

        public C10945a(Type type) {
            this.f24939c = C10944b.m11866b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C10944b.m11862f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f24939c;
        }

        public int hashCode() {
            return this.f24939c.hashCode();
        }

        public String toString() {
            return C10944b.m11847u(this.f24939c) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: io.intercom.com.google.gson.t.b$b */
    /* loaded from: classes3.dex */
    public static final class C10946b implements ParameterizedType, Serializable {

        /* renamed from: c */
        private final Type f24940c;

        /* renamed from: d */
        private final Type f24941d;

        /* renamed from: e */
        private final Type[] f24942e;

        public C10946b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C10943a.m11869a(z);
            }
            this.f24940c = type == null ? null : C10944b.m11866b(type);
            this.f24941d = C10944b.m11866b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f24942e = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C10943a.m11868b(this.f24942e[i]);
                C10944b.m11865c(this.f24942e[i]);
                Type[] typeArr3 = this.f24942e;
                typeArr3[i] = C10944b.m11866b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C10944b.m11862f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f24942e.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f24940c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f24941d;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f24942e) ^ this.f24941d.hashCode()) ^ C10944b.m11855m(this.f24940c);
        }

        public String toString() {
            int length = this.f24942e.length;
            if (length == 0) {
                return C10944b.m11847u(this.f24941d);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C10944b.m11847u(this.f24941d));
            sb.append("<");
            sb.append(C10944b.m11847u(this.f24942e[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C10944b.m11847u(this.f24942e[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: io.intercom.com.google.gson.t.b$c */
    /* loaded from: classes3.dex */
    public static final class C10947c implements WildcardType, Serializable {

        /* renamed from: c */
        private final Type f24943c;

        /* renamed from: d */
        private final Type f24944d;

        public C10947c(Type[] typeArr, Type[] typeArr2) {
            C10943a.m11869a(typeArr2.length <= 1);
            C10943a.m11869a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C10943a.m11868b(typeArr2[0]);
                C10944b.m11865c(typeArr2[0]);
                C10943a.m11869a(typeArr[0] == Object.class);
                this.f24944d = C10944b.m11866b(typeArr2[0]);
                this.f24943c = Object.class;
                return;
            }
            C10943a.m11868b(typeArr[0]);
            C10944b.m11865c(typeArr[0]);
            this.f24944d = null;
            this.f24943c = C10944b.m11866b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C10944b.m11862f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f24944d;
            return type != null ? new Type[]{type} : C10944b.f24938a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f24943c};
        }

        public int hashCode() {
            Type type = this.f24944d;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f24943c.hashCode() + 31);
        }

        public String toString() {
            if (this.f24944d != null) {
                return "? super " + C10944b.m11847u(this.f24944d);
            } else if (this.f24943c == Object.class) {
                return "?";
            } else {
                return "? extends " + C10944b.m11847u(this.f24943c);
            }
        }
    }

    /* renamed from: a */
    public static GenericArrayType m11867a(Type type) {
        return new C10945a(type);
    }

    /* renamed from: b */
    public static Type m11866b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C10945a(m11866b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C10946b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C10945a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new C10947c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    /* renamed from: c */
    static void m11865c(Type type) {
        C10943a.m11869a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    private static Class<?> m11864d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m11863e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m11862f(Type type, Type type2) {
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
                return m11863e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m11862f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m11861g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m11860h(Type type, Class<?> cls) {
        Type m11856l = m11856l(type, cls, Collection.class);
        if (m11856l instanceof WildcardType) {
            m11856l = ((WildcardType) m11856l).getUpperBounds()[0];
        }
        if (m11856l instanceof ParameterizedType) {
            return ((ParameterizedType) m11856l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: i */
    static Type m11859i(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m11859i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m11859i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m11858j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m11856l = m11856l(type, cls, Map.class);
        return m11856l instanceof ParameterizedType ? ((ParameterizedType) m11856l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m11857k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C10943a.m11869a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m11857k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m11857k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: l */
    static Type m11856l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C10943a.m11869a(cls2.isAssignableFrom(cls));
        return m11852p(type, cls, m11859i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m11855m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m11854n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m11853o(Type type, Type type2, Type... typeArr) {
        return new C10946b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m11852p(Type type, Class<?> cls, Type type2) {
        return m11851q(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type m11851q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
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
            java.lang.reflect.Type r10 = m11850r(r8, r9, r0)
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
            java.lang.reflect.Type r8 = m11851q(r8, r9, r10, r11)
            if (r10 != r8) goto L30
            goto L34
        L30:
            java.lang.reflect.GenericArrayType r0 = m11867a(r8)
        L34:
            return r0
        L35:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L4b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m11851q(r8, r9, r0, r11)
            if (r0 != r8) goto L46
            goto L4a
        L46:
            java.lang.reflect.GenericArrayType r10 = m11867a(r8)
        L4a:
            return r10
        L4b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8b
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m11851q(r8, r9, r0, r11)
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
            java.lang.reflect.Type r6 = m11851q(r8, r9, r6, r11)
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
            java.lang.reflect.ParameterizedType r10 = m11853o(r3, r8, r4)
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
            java.lang.reflect.Type r8 = m11851q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto Lbd
            java.lang.reflect.WildcardType r8 = m11848t(r8)
            return r8
        Lab:
            int r0 = r3.length
            if (r0 != r1) goto Lbd
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m11851q(r8, r9, r0, r11)     // Catch: java.lang.Throwable -> Lbe
            r9 = r3[r2]
            if (r8 == r9) goto Lbd
            java.lang.reflect.WildcardType r8 = m11849s(r8)
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
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.google.gson.p418t.C10944b.m11851q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m11850r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m11864d = m11864d(typeVariable);
        if (m11864d == null) {
            return typeVariable;
        }
        Type m11859i = m11859i(type, cls, m11864d);
        if (m11859i instanceof ParameterizedType) {
            return ((ParameterizedType) m11859i).getActualTypeArguments()[m11854n(m11864d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* renamed from: s */
    public static WildcardType m11849s(Type type) {
        return new C10947c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f24938a);
    }

    /* renamed from: t */
    public static WildcardType m11848t(Type type) {
        return new C10947c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* renamed from: u */
    public static String m11847u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
