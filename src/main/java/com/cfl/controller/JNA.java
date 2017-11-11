package com.cfl.controller;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * Created by Administrator on 2017/11/9.
 */
public class JNA {
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)
                Native.loadLibrary((Platform.isWindows() ? "d://HSoft4_2.dll" : "d"),
                        CLibrary.class);

        public abstract int _ReadVersion(Integer MacNO, String id);
    }

    public static void main(String[] args) {
        CLibrary.INSTANCE._ReadVersion(1,"00001");
    }
}
