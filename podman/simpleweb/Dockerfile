# Use Node image
FROM node:18-alpine

# Create app directory
WORKDIR /usr/app

# Copy package.json first
COPY package.json ./

# Install dependencies
RUN npm install

# Copy app source code
COPY index.js ./

# Expose the app port
EXPOSE 8080

# Start the app
CMD ["npm", "start"]
