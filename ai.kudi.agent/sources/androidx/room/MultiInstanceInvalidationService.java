package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.InterfaceC1769e0;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: c */
    int f5389c = 0;

    /* renamed from: d */
    final HashMap<Integer, String> f5390d = new HashMap<>();

    /* renamed from: e */
    final RemoteCallbackList<InterfaceC1765d0> f5391e = new RemoteCallbackListC1756a();

    /* renamed from: f */
    private final InterfaceC1769e0.AbstractBinderC1770a f5392f = new BinderC1757b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* loaded from: classes2.dex */
    class RemoteCallbackListC1756a extends RemoteCallbackList<InterfaceC1765d0> {
        RemoteCallbackListC1756a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(InterfaceC1765d0 interfaceC1765d0, Object obj) {
            MultiInstanceInvalidationService.this.f5390d.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* loaded from: classes2.dex */
    class BinderC1757b extends InterfaceC1769e0.AbstractBinderC1770a {
        BinderC1757b() {
        }

        @Override // androidx.room.InterfaceC1769e0
        /* renamed from: N */
        public int mo34543N(InterfaceC1765d0 interfaceC1765d0, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f5391e) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f5389c + 1;
                multiInstanceInvalidationService.f5389c = i;
                if (MultiInstanceInvalidationService.this.f5391e.register(interfaceC1765d0, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f5390d.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f5389c--;
                return 0;
            }
        }

        @Override // androidx.room.InterfaceC1769e0
        /* renamed from: j1 */
        public void mo34542j1(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f5391e) {
                String str = MultiInstanceInvalidationService.this.f5390d.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f5391e.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f5391e.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f5390d.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f5391e.getBroadcastItem(i2).mo34508D(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f5391e.finishBroadcast();
            }
        }

        @Override // androidx.room.InterfaceC1769e0
        /* renamed from: l1 */
        public void mo34541l1(InterfaceC1765d0 interfaceC1765d0, int i) {
            synchronized (MultiInstanceInvalidationService.this.f5391e) {
                MultiInstanceInvalidationService.this.f5391e.unregister(interfaceC1765d0);
                MultiInstanceInvalidationService.this.f5390d.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5392f;
    }
}
