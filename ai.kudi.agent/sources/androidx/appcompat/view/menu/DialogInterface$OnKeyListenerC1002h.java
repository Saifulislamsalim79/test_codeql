package androidx.appcompat.view.menu;

import ai.kudi.agent.login.domain.LoginParams;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.appcompat.view.menu.InterfaceC1014m;
import p201g.p202a.C7458g;
/* compiled from: MenuDialogHelper.java */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes2.dex */
class DialogInterface$OnKeyListenerC1002h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1014m.InterfaceC1015a {

    /* renamed from: c */
    private C0999g f2889c;

    /* renamed from: d */
    private DialogInterfaceC0936d f2890d;

    /* renamed from: e */
    C0996e f2891e;

    /* renamed from: f */
    private InterfaceC1014m.InterfaceC1015a f2892f;

    public DialogInterface$OnKeyListenerC1002h(C0999g c0999g) {
        this.f2889c = c0999g;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
    /* renamed from: a */
    public void mo37237a(C0999g c0999g, boolean z) {
        if (z || c0999g == this.f2889c) {
            m37506c();
        }
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2892f;
        if (interfaceC1015a != null) {
            interfaceC1015a.mo37237a(c0999g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
    /* renamed from: b */
    public boolean mo37236b(C0999g c0999g) {
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2892f;
        if (interfaceC1015a != null) {
            return interfaceC1015a.mo37236b(c0999g);
        }
        return false;
    }

    /* renamed from: c */
    public void m37506c() {
        DialogInterfaceC0936d dialogInterfaceC0936d = this.f2890d;
        if (dialogInterfaceC0936d != null) {
            dialogInterfaceC0936d.dismiss();
        }
    }

    /* renamed from: d */
    public void m37505d(IBinder iBinder) {
        C0999g c0999g = this.f2889c;
        DialogInterfaceC0936d.C0937a c0937a = new DialogInterfaceC0936d.C0937a(c0999g.m37510w());
        C0996e c0996e = new C0996e(c0937a.getContext(), C7458g.abc_list_menu_item_layout);
        this.f2891e = c0996e;
        c0996e.mo26754m(this);
        this.f2889c.m37534b(this.f2891e);
        c0937a.setAdapter(this.f2891e.m37565b(), this);
        View m37555A = c0999g.m37555A();
        if (m37555A != null) {
            c0937a.setCustomTitle(m37555A);
        } else {
            c0937a.setIcon(c0999g.m37508y()).setTitle(c0999g.m37507z());
        }
        c0937a.setOnKeyListener(this);
        DialogInterfaceC0936d create = c0937a.create();
        this.f2890d = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2890d.getWindow().getAttributes();
        attributes.type = LoginParams.PERMISSION_REQUEST_CODE;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2890d.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2889c.m37547N((C1003i) this.f2891e.m37565b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f2891e.mo26766a(this.f2889c, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2890d.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2890d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2889c.m37528e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2889c.performShortcut(i, keyEvent, 0);
    }
}
