package com.google.gson.internal;

import com.google.gson.InterfaceC6792h;
import com.google.gson.JsonIOException;
import com.google.gson.internal.p183m.AbstractC6896b;
import com.google.gson.p184v.C6916a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* compiled from: ConstructorConstructor.java */
/* renamed from: com.google.gson.internal.c */
/* loaded from: classes2.dex */
public final class C6858c {

    /* renamed from: a */
    private final Map<Type, InterfaceC6792h<?>> f16503a;

    /* renamed from: b */
    private final AbstractC6896b f16504b = AbstractC6896b.m20556a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$a */
    /* loaded from: classes2.dex */
    public class C6859a implements InterfaceC6884h<T> {
        C6859a(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$b */
    /* loaded from: classes2.dex */
    public class C6860b implements InterfaceC6884h<T> {
        C6860b(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$c */
    /* loaded from: classes2.dex */
    public class C6861c implements InterfaceC6884h<T> {
        C6861c(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$d */
    /* loaded from: classes2.dex */
    public class C6862d implements InterfaceC6884h<T> {
        C6862d(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.google.gson.internal.g] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new C6876g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$e */
    /* loaded from: classes2.dex */
    public class C6863e implements InterfaceC6884h<T> {

        /* renamed from: a */
        private final AbstractC6890l f16505a = AbstractC6890l.m20558b();

        /* renamed from: b */
        final /* synthetic */ Class f16506b;

        /* renamed from: c */
        final /* synthetic */ Type f16507c;

        C6863e(C6858c c6858c, Class cls, Type type) {
            this.f16506b = cls;
            this.f16507c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            try {
                return this.f16505a.mo20557c(this.f16506b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f16507c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$f */
    /* loaded from: classes2.dex */
    class C6864f implements InterfaceC6884h<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6792h f16508a;

        /* renamed from: b */
        final /* synthetic */ Type f16509b;

        C6864f(C6858c c6858c, InterfaceC6792h interfaceC6792h, Type type) {
            this.f16508a = interfaceC6792h;
            this.f16509b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return this.f16508a.m20731a(this.f16509b);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$g */
    /* loaded from: classes2.dex */
    class C6865g implements InterfaceC6884h<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6792h f16510a;

        /* renamed from: b */
        final /* synthetic */ Type f16511b;

        C6865g(C6858c c6858c, InterfaceC6792h interfaceC6792h, Type type) {
            this.f16510a = interfaceC6792h;
            this.f16511b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return this.f16510a.m20731a(this.f16511b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$h */
    /* loaded from: classes2.dex */
    public class C6866h implements InterfaceC6884h<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f16512a;

        C6866h(C6858c c6858c, Constructor constructor) {
            this.f16512a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            try {
                return this.f16512a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.f16512a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.f16512a + " with no args", e3.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$i */
    /* loaded from: classes2.dex */
    public class C6867i implements InterfaceC6884h<T> {
        C6867i(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$j */
    /* loaded from: classes2.dex */
    public class C6868j implements InterfaceC6884h<T> {

        /* renamed from: a */
        final /* synthetic */ Type f16513a;

        C6868j(C6858c c6858c, Type type) {
            this.f16513a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            Type type = this.f16513a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f16513a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f16513a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$k */
    /* loaded from: classes2.dex */
    public class C6869k implements InterfaceC6884h<T> {
        C6869k(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$l */
    /* loaded from: classes2.dex */
    public class C6870l implements InterfaceC6884h<T> {
        C6870l(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$m */
    /* loaded from: classes2.dex */
    public class C6871m implements InterfaceC6884h<T> {
        C6871m(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$n */
    /* loaded from: classes2.dex */
    public class C6872n implements InterfaceC6884h<T> {
        C6872n(C6858c c6858c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // com.google.gson.internal.InterfaceC6884h
        /* renamed from: a */
        public T mo20568a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C6858c(Map<Type, InterfaceC6792h<?>> map) {
        this.f16503a = map;
    }

    /* renamed from: b */
    private <T> InterfaceC6884h<T> m20592b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f16504b.mo20555b(declaredConstructor);
            }
            return new C6866h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> InterfaceC6884h<T> m20591c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C6867i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C6868j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C6869k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C6870l(this);
            }
            return new C6871m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C6872n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C6859a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C6860b(this);
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(C6916a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C6861c(this);
            }
            return new C6862d(this);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private <T> InterfaceC6884h<T> m20590d(Type type, Class<? super T> cls) {
        return new C6863e(this, cls, type);
    }

    /* renamed from: a */
    public <T> InterfaceC6884h<T> m20593a(C6916a<T> c6916a) {
        Type type = c6916a.getType();
        Class<? super T> rawType = c6916a.getRawType();
        InterfaceC6792h<?> interfaceC6792h = this.f16503a.get(type);
        if (interfaceC6792h != null) {
            return new C6864f(this, interfaceC6792h, type);
        }
        InterfaceC6792h<?> interfaceC6792h2 = this.f16503a.get(rawType);
        if (interfaceC6792h2 != null) {
            return new C6865g(this, interfaceC6792h2, type);
        }
        InterfaceC6884h<T> m20592b = m20592b(rawType);
        if (m20592b != null) {
            return m20592b;
        }
        InterfaceC6884h<T> m20591c = m20591c(type, rawType);
        return m20591c != null ? m20591c : m20590d(type, rawType);
    }

    public String toString() {
        return this.f16503a.toString();
    }
}
