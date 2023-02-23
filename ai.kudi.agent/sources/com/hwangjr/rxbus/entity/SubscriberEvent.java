package com.hwangjr.rxbus.entity;

import com.hwangjr.rxbus.thread.EventThread;
import j.e.e0.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p425j.p444e.p471k0.AbstractC11683d;
import p425j.p444e.p471k0.C11680b;
/* loaded from: classes2.dex */
public class SubscriberEvent extends Event {
    private final int hashCode;
    private final Method method;
    private AbstractC11683d subject;
    private final Object target;
    private final EventThread thread;
    private boolean valid = true;

    public SubscriberEvent(Object obj, Method method, EventThread eventThread) {
        if (obj == null) {
            throw new NullPointerException("SubscriberEvent target cannot be null.");
        }
        if (method == null) {
            throw new NullPointerException("SubscriberEvent method cannot be null.");
        }
        if (eventThread != null) {
            this.target = obj;
            this.method = method;
            this.thread = eventThread;
            method.setAccessible(true);
            initObservable();
            this.hashCode = ((method.hashCode() + 31) * 31) + obj.hashCode();
            return;
        }
        throw new NullPointerException("SubscriberEvent thread cannot be null.");
    }

    private void initObservable() {
        C11680b m10564v0 = C11680b.m10564v0();
        this.subject = m10564v0;
        m10564v0.m10528R(EventThread.getScheduler(this.thread)).m10516d0(new e() { // from class: com.hwangjr.rxbus.entity.SubscriberEvent.1
            public void accept(Object obj) {
                try {
                    if (SubscriberEvent.this.valid) {
                        SubscriberEvent.this.handleEvent(obj);
                    }
                } catch (InvocationTargetException e) {
                    SubscriberEvent subscriberEvent = SubscriberEvent.this;
                    subscriberEvent.throwRuntimeException("Could not dispatch event: " + obj.getClass() + " to subscriber " + SubscriberEvent.this, e);
                }
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SubscriberEvent.class == obj.getClass()) {
            SubscriberEvent subscriberEvent = (SubscriberEvent) obj;
            return this.method.equals(subscriberEvent.method) && this.target == subscriberEvent.target;
        }
        return false;
    }

    public AbstractC11683d getSubject() {
        return this.subject;
    }

    public void handle(Object obj) {
        this.subject.mo331f(obj);
    }

    protected void handleEvent(Object obj) throws InvocationTargetException {
        if (this.valid) {
            try {
                this.method.invoke(this.target, obj);
                return;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        }
        throw new IllegalStateException(toString() + " has been invalidated and can no longer handle events.");
    }

    public int hashCode() {
        return this.hashCode;
    }

    public void invalidate() {
        this.valid = false;
    }

    public boolean isValid() {
        return this.valid;
    }

    @Override // com.hwangjr.rxbus.entity.Event
    public /* bridge */ /* synthetic */ void throwRuntimeException(String str, Throwable th) {
        super.throwRuntimeException(str, th);
    }

    public String toString() {
        return "[SubscriberEvent " + this.method + "]";
    }

    @Override // com.hwangjr.rxbus.entity.Event
    public /* bridge */ /* synthetic */ void throwRuntimeException(String str, InvocationTargetException invocationTargetException) {
        super.throwRuntimeException(str, invocationTargetException);
    }
}
