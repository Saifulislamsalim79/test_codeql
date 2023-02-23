package com.hwangjr.rxbus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.a.a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p471k0.AbstractC11683d;
import p425j.p444e.p471k0.C11680b;
@Deprecated
/* loaded from: classes2.dex */
public class RxBusOlder {
    private static final boolean DEBUG = true;
    private static RxBusOlder sInstance;
    private ConcurrentHashMap<Object, List<AbstractC11683d>> mSubjectsMapper = new ConcurrentHashMap<>();

    private RxBusOlder() {
    }

    public static synchronized RxBusOlder instance() {
        RxBusOlder rxBusOlder;
        synchronized (RxBusOlder.class) {
            if (sInstance == null) {
                sInstance = new RxBusOlder();
            }
            rxBusOlder = sInstance;
        }
        return rxBusOlder;
    }

    public void post(Object obj, Object obj2) {
        List<AbstractC11683d> list = this.mSubjectsMapper.get(obj);
        if (list != null && !list.isEmpty()) {
            for (AbstractC11683d abstractC11683d : list) {
                abstractC11683d.mo331f(obj2);
            }
        }
        a.a("[send] mSubjectsMapper: " + this.mSubjectsMapper, new Object[0]);
    }

    public <T> AbstractC11688p<T> register(Object obj, Class<T> cls) {
        List<AbstractC11683d> list = this.mSubjectsMapper.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.mSubjectsMapper.put(obj, list);
        }
        C11680b m10564v0 = C11680b.m10564v0();
        list.add(m10564v0);
        a.a("[register] mSubjectsMapper: " + this.mSubjectsMapper, new Object[0]);
        return m10564v0;
    }

    public void unregister(Object obj, AbstractC11688p abstractC11688p) {
        List<AbstractC11683d> list = this.mSubjectsMapper.get(obj);
        if (list != null) {
            list.remove(abstractC11688p);
            if (list.isEmpty()) {
                this.mSubjectsMapper.remove(obj);
            }
            a.a("[unregister] mSubjectsMapper: " + this.mSubjectsMapper, new Object[0]);
        }
    }
}
