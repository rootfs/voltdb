/* This file is part of VoltDB.
 * Copyright (C) 2008-2016 VoltDB Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with VoltDB.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.voltdb.client;

import org.voltdb.client.ClientResponse;

/**
 * Packages up the data to be sent back to the client as a stored
 * procedure response for a partition
 *
 */
public class ClientResponseWithPartitionKey {

    final public Object m_partitionKey;
    final public ClientResponse m_response;
    /**
     *
     * @param partitionKey  A partition key to reach the partition
     * @param response The ClientResponse instance from the procedure execution
     */
    ClientResponseWithPartitionKey(Object partitionKey, ClientResponse response) {
        m_partitionKey = partitionKey;
        m_response = response;
    }
}
