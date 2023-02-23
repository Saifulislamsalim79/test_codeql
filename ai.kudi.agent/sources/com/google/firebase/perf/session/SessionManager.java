package com.google.firebase.perf.session;

import androidx.annotation.Keep;
import com.google.firebase.perf.p172f.AbstractC6596b;
import com.google.firebase.perf.p172f.C6593a;
import com.google.firebase.perf.p179k.EnumC6652d;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@Keep
/* loaded from: classes2.dex */
public class SessionManager extends AbstractC6596b {
    private static final SessionManager instance = new SessionManager();
    private final C6593a appStateMonitor;
    private final Set<WeakReference<InterfaceC6712b>> clients;
    private final GaugeManager gaugeManager;
    private C6710a perfSession;

    private SessionManager() {
        this(GaugeManager.getInstance(), C6710a.m20987c(), C6593a.m21528b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC6652d enumC6652d) {
        if (this.perfSession.m20984f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.m20982h(), enumC6652d);
        }
    }

    private void startOrStopCollectingGauges(EnumC6652d enumC6652d) {
        if (this.perfSession.m20984f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, enumC6652d);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @Override // com.google.firebase.perf.p172f.AbstractC6596b, com.google.firebase.perf.p172f.C6593a.InterfaceC6595b
    public void onUpdateAppState(EnumC6652d enumC6652d) {
        super.onUpdateAppState(enumC6652d);
        if (this.appStateMonitor.m21523g()) {
            return;
        }
        if (enumC6652d == EnumC6652d.FOREGROUND) {
            updatePerfSession(enumC6652d);
        } else if (updatePerfSessionIfExpired()) {
        } else {
            startOrStopCollectingGauges(enumC6652d);
        }
    }

    public final C6710a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<InterfaceC6712b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setPerfSession(C6710a c6710a) {
        this.perfSession = c6710a;
    }

    public void unregisterForSessionUpdates(WeakReference<InterfaceC6712b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(EnumC6652d enumC6652d) {
        synchronized (this.clients) {
            this.perfSession = C6710a.m20987c();
            Iterator<WeakReference<InterfaceC6712b>> it = this.clients.iterator();
            while (it.hasNext()) {
                InterfaceC6712b interfaceC6712b = it.next().get();
                if (interfaceC6712b != null) {
                    interfaceC6712b.mo20977a(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(enumC6652d);
        startOrStopCollectingGauges(enumC6652d);
    }

    public boolean updatePerfSessionIfExpired() {
        if (this.perfSession.m20985e()) {
            updatePerfSession(this.appStateMonitor.m21529a());
            return true;
        }
        return false;
    }

    public SessionManager(GaugeManager gaugeManager, C6710a c6710a, C6593a c6593a) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = c6710a;
        this.appStateMonitor = c6593a;
        registerForAppState();
    }
}
