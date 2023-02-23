package com.hwangjr.rxbus.finder;

import com.hwangjr.rxbus.annotation.Produce;
import com.hwangjr.rxbus.annotation.Subscribe;
import com.hwangjr.rxbus.annotation.Tag;
import com.hwangjr.rxbus.entity.EventType;
import com.hwangjr.rxbus.entity.ProducerEvent;
import com.hwangjr.rxbus.entity.SubscriberEvent;
import com.hwangjr.rxbus.p189annotation.Excludes;
import com.hwangjr.rxbus.thread.EventThread;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final class AnnotatedFinder {
    private static final ConcurrentMap<Class<?>, Map<EventType, SourceMethod>> PRODUCERS_CACHE = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, Map<EventType, Set<SourceMethod>>> SUBSCRIBERS_CACHE = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SourceMethod {
        private Method method;
        private EventThread thread;

        private SourceMethod(EventThread eventThread, Method method) {
            this.thread = eventThread;
            this.method = method;
        }
    }

    private AnnotatedFinder() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<EventType, ProducerEvent> findAllProducers(Object obj) {
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map<EventType, SourceMethod> map = PRODUCERS_CACHE.get(cls);
        if (map == null) {
            map = new HashMap<>();
            loadAnnotatedProducerMethods(cls, map);
        }
        if (!map.isEmpty()) {
            for (Map.Entry<EventType, SourceMethod> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), new ProducerEvent(obj, entry.getValue().method, entry.getValue().thread));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<EventType, Set<SubscriberEvent>> findAllSubscribers(Object obj) {
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map<EventType, Set<SourceMethod>> map = SUBSCRIBERS_CACHE.get(cls);
        if (map == null) {
            map = new HashMap<>();
            loadAnnotatedSubscriberMethods(cls, map);
        }
        if (!map.isEmpty()) {
            for (Map.Entry<EventType, Set<SourceMethod>> entry : map.entrySet()) {
                HashSet hashSet = new HashSet();
                for (SourceMethod sourceMethod : entry.getValue()) {
                    hashSet.add(new SubscriberEvent(obj, sourceMethod.method, sourceMethod.thread));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }

    private static void loadAnnotatedMethods(Class<?> cls, Map<EventType, SourceMethod> map, Map<EventType, Set<SourceMethod>> map2) {
        Method[] declaredMethods;
        Class<?>[] parameterTypes;
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.isBridge()) {
                if (method.isAnnotationPresent(Subscribe.class)) {
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length == 1) {
                        Class<?> cls2 = parameterTypes2[0];
                        if (!cls2.isInterface()) {
                            if ((1 & method.getModifiers()) != 0) {
                                Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                                EventThread thread = subscribe.thread();
                                Tag[] tags = subscribe.tags();
                                int length = tags == null ? 0 : tags.length;
                                do {
                                    EventType eventType = new EventType(length > 0 ? tags[length - 1].value() : Excludes.DEFAULT, cls2);
                                    Set<SourceMethod> set = map2.get(eventType);
                                    if (set == null) {
                                        set = new HashSet<>();
                                        map2.put(eventType, set);
                                    }
                                    set.add(new SourceMethod(thread, method));
                                    length--;
                                } while (length > 0);
                            } else {
                                throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " but is not 'public'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " which is an interface.  Subscription must be on a concrete class type.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation but requires " + parameterTypes2.length + " arguments.  Methods must require a single argument.");
                    }
                } else if (method.isAnnotationPresent(Produce.class)) {
                    if (method.getParameterTypes().length == 0) {
                        if (method.getReturnType() != Void.class) {
                            Class<?> returnType = method.getReturnType();
                            if (!returnType.isInterface()) {
                                if (!returnType.equals(Void.TYPE)) {
                                    if ((1 & method.getModifiers()) != 0) {
                                        Produce produce = (Produce) method.getAnnotation(Produce.class);
                                        EventThread thread2 = produce.thread();
                                        Tag[] tags2 = produce.tags();
                                        int length2 = tags2 == null ? 0 : tags2.length;
                                        do {
                                            EventType eventType2 = new EventType(length2 > 0 ? tags2[length2 - 1].value() : Excludes.DEFAULT, returnType);
                                            if (!map.containsKey(eventType2)) {
                                                map.put(eventType2, new SourceMethod(thread2, method));
                                                length2--;
                                            } else {
                                                throw new IllegalArgumentException("Producer for type " + eventType2 + " has already been registered.");
                                            }
                                        } while (length2 > 0);
                                    } else {
                                        throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " but is not 'public'.");
                                    }
                                } else {
                                    throw new IllegalArgumentException("Method " + method + " has @Produce annotation but has no return type.");
                                }
                            } else {
                                throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " which is an interface.  Producers must return a concrete class type.");
                            }
                        } else {
                            throw new IllegalArgumentException("Method " + method + " has a return type of void.  Must declare a non-void type.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + "has @Produce annotation but requires " + parameterTypes.length + " arguments.  Methods must require zero arguments.");
                    }
                } else {
                    continue;
                }
            }
        }
        PRODUCERS_CACHE.put(cls, map);
        SUBSCRIBERS_CACHE.put(cls, map2);
    }

    private static void loadAnnotatedProducerMethods(Class<?> cls, Map<EventType, SourceMethod> map) {
        loadAnnotatedMethods(cls, map, new HashMap());
    }

    private static void loadAnnotatedSubscriberMethods(Class<?> cls, Map<EventType, Set<SourceMethod>> map) {
        loadAnnotatedMethods(cls, new HashMap(), map);
    }
}
