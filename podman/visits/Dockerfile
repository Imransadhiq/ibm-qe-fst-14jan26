# Base Image
FROM docker.io/node:25-alpine

# Switch Working Dir to '/usr/app'
WORKDIR /usr/app

# Copy over the package.json into
# the container
COPY package.json .

# Install the deps
RUN npm install

# Copy the rest of the files over
COPY . .

# Start the App
CMD ["npm", "start"]