/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.pulseaudio.internal;

/**
 * Represents all valid commands which could be processed by this binding
 *
 * @author Tobias Bräutigam
 * @since 1.2.0
 */
public enum PulseaudioCommandTypeMapping {

    EXISTS, // whether an pulseaudio item exists or not
    MUTED, // whether an pulseaudio item is muted or not
    VOLUME, // the volume setting of an pulseaudio item
    ID, // the ID of an pulseaudio item
    MODULE_ID, // the module id of an pulseaudio item
    SLAVE_SINKS, // the names of slave sinks that are members of an combined sink
    RUNNING, // wether an pulseaudio item is in state RUNNING or not
    IDLE, // wether an pulseaudio item is in state IDLE or not
    SUSPENDED, // wether an pulseaudio item is in state SUSPENDED or not
    CORKED // wether an pulseaudio item is in state CORKED or not

}
