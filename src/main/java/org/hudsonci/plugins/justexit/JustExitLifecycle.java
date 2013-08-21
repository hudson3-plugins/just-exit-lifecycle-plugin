/*
 * Copyright (c) 2013 Hudson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hudson - initial API and implementation and/or initial documentation
 */

package org.hudsonci.plugins.justexit;

import hudson.Extension;
import hudson.lifecycle.Lifecycle;
import hudson.lifecycle.RestartNotSupportedException;
import java.io.IOException;

/**
 * A Hudson Lifecycle that just exits. For use with scripts that automatically
 * restart Hudson if it exits.
 * @author bobfoster
 */
@Extension
public class JustExitLifecycle extends Lifecycle {

    @Override
    public void restart() throws IOException, InterruptedException {
        System.exit(0);
    }

    @Override
    public void verifyRestartable() throws RestartNotSupportedException {
    }

    @Override
    public boolean canRestart() {
        return true;
    }

    @Override
    public boolean isSafeRestartable() {
        return true;
    }
}
